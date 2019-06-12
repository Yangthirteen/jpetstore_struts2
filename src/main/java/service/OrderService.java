package service;

import domain.Item;
import domain.LineItem;
import domain.Order;
import domain.Sequence;
import persistence.ItemDAO;
import persistence.LineItemDAO;
import persistence.OrderDAO;
import persistence.SequenceDAO;
import persistence.impl.ItemDAOImpl;
import persistence.impl.LineItemDAOImpl;
import persistence.impl.OrderDAOImpl;
import persistence.impl.SequenceDAOImpl;

import java.util.List;


public class OrderService {
    private OrderDAO orderDAO;
    private LineItemDAO lineItemDAO;
    private ItemDAO itemDAO;
    private SequenceDAO sequenceDAO;

    public OrderService()
    {
        orderDAO=new OrderDAOImpl();
        lineItemDAO=new LineItemDAOImpl();
        itemDAO=new ItemDAOImpl();
        sequenceDAO=new SequenceDAOImpl();
    }

    public int getnextID(String name)
    {
        Sequence sequence=new Sequence(name,-1);
        sequence = (Sequence) sequenceDAO.getSequence(sequence);
        if(sequence==null)
        {
            throw new RuntimeException("Error:A null sequence was returned from the database (could not get next \" + name\n" +
                    "          + \" sequence).");
        }
        Sequence parameterObject=new Sequence(name,sequence.getnextID()+1);
        sequenceDAO.updateSequence(parameterObject);
        return sequence.getnextID();
    }

    public void insertOrder(Order order)
    {
        order.setorderID(getnextID("ordernum"));
        for(int i=0;i<order.getLineItems().size();i++)
        {
            LineItem lineItem=(LineItem)order.getLineItems().get(i);
            itemDAO.updateInventoryQuantity(lineItem.getItemId(),lineItem.getQuantity());
        }
        orderDAO.insertOrder(order);
        orderDAO.insertOrderStatus(order);
        for(int i=0;i<order.getLineItems().size();i++)
        {
            LineItem lineItem=(LineItem)order.getLineItems().get(i);
            lineItem.setOrderId(order.getorderID());
            lineItemDAO.insertLineItem(lineItem);
        }
    }

    public Order getOrder(int orderId){
        Order order=orderDAO.getOrder(orderId);
        order.setLineItems(lineItemDAO.getLineItemsByOrderId(orderId));
        for(int i=0;i<order.getLineItems().size();i++){
            LineItem lineItem=(LineItem)order.getLineItems().get(i);
            Item item=itemDAO.getItem(lineItem.getItemId());

            item.setQuantity(itemDAO.getInventoryQuantity(lineItem.getItemId()));
            lineItem.setItem(item);
        }

        return order;
    }

    public List<Order> getOrdersByUsername(String username){
        return orderDAO.getOrdersByUsername(username);
    }
}
