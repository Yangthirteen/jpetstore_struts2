package web;

import com.opensymphony.xwork2.ActionContext;
import domain.Order;

import java.util.Map;

public class ShippingFormAction {

    public Order order = new Order();
    public String shippingForm(){

        Map m = ActionContext.getContext().getSession();
        m.put("order",order);

        return "true";
    }
}
