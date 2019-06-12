package web;

import com.opensymphony.xwork2.ActionContext;
import domain.Order;

import java.util.Map;

public class ConfirmNewOrderAction {

    public Order order = new Order();

    public String getIsShippingAddressRequired() {
        return isShippingAddressRequired;
    }

    public void setIsShippingAddressRequired(String isShippingAddressRequired) {
        this.isShippingAddressRequired = isShippingAddressRequired;
    }

    private String isShippingAddressRequired;

    public String getShippingAddressRequired() {
        return shippingAddressRequired;
    }

    public void setShippingAddressRequired(String shippingAddressRequired) {
        this.shippingAddressRequired = shippingAddressRequired;
    }

    public String shippingAddressRequired;

    public String confirmNewOrder(){

        Map m = ActionContext.getContext().getSession();
        m.put("order",order);

        isShippingAddressRequired =(String) m.put("shippingAddressRequired",shippingAddressRequired);

        if(isShippingAddressRequired==null)
        {
            m.put("order",order);
            return "confirm";
        }
        else
        {
            m.put("order",order);
            return "shippingForm";
        }
    }
}
