package web;

import com.opensymphony.xwork2.ActionContext;
import domain.Order;

import java.util.Map;

public class ViewOrderFormAction {

    public Order order = new Order();

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int orderId;

    public String viewOrderForm(){

        Map m = ActionContext.getContext().getSession();
        m.put("order",order);
        m.put("orderId",orderId);

        return "true";
    }
}
