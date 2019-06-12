package web;

import com.opensymphony.xwork2.ActionContext;
import domain.Order;
import service.OrderService;
import java.math.BigDecimal;
import java.util.Map;

public class ViewOrderAction {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String viewOrder(){

        BigDecimal subTotal=new BigDecimal(0);

        Map m = ActionContext.getContext().getSession();
        OrderService orderService=new OrderService();
        Order order = (Order)m.get("order");

        m.put("subTotal",subTotal);
        orderService.insertOrder(order);
        m.put("order",order);
        m.put("cart",null);

        return "true";
    }
}
