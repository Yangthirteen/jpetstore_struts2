package web;

import com.opensymphony.xwork2.ActionContext;
import domain.Order;
import service.OrderService;

import java.util.List;
import java.util.Map;

public class ViewListOrdersAction {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;

    public String viewListOrders(){

        Map m = ActionContext.getContext().getSession();
        m.put("username",username);
        OrderService service=new OrderService();
        List<Order> orderList=service.getOrdersByUsername(username);
        m.put("orderList",orderList);

        return "true";
    }
}
