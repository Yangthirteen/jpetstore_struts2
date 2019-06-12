package web;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import domain.Cart;
import domain.Item;
import domain.Order;
import service.CatelogService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AddItemToCartAction{

    public Item item = new Item();

    public String getWorkingItemID() {
        return workingItemID;
    }

    public void setWorkingItemID(String workingItemID) {
        this.workingItemID = workingItemID;
    }

    public String workingItemID;
    public String addItemToCart() {

        BigDecimal subTotal;


        Map m = ActionContext.getContext().getSession();
        Cart cart = (Cart)m.get("cart");

        //判断是否存在购物车
        if(cart == null){
            cart = new Cart();
        }

        if(cart.containsItemId(workingItemID)){
            cart.incrementQuantityByItemId(workingItemID);
        }
        else{
            CatelogService catalogService = new CatelogService();
            Boolean isInStock = catalogService.isItemInStock(workingItemID);
            Item item = catalogService.getItem(workingItemID);
            cart.addItem(item,isInStock); //生成了LineItem和cartItem

            Order order = (Order)m.get("order");
            if(order == null){
                order = new Order();
                order.addLineItem(cart.addItem(item,isInStock));
            }
            else{
                order.addLineItem(cart.addItem(item,isInStock));
            }

            List<Order> orderList = (List<Order>)m.get("orderList");
            if(orderList == null){
                orderList = new ArrayList<>();
            }

            m.put("order",order);
            m.put("orderList",orderList);
        }

        m.put("cart",cart);

        subTotal = cart.getSubTotal();
        m.put("cart",cart);
        m.put("subTotal",subTotal);
        m.put("cartNum",cart.getNumberOfItems());

        return "true";
    }


}

