package web;

import com.opensymphony.xwork2.ActionContext;
import domain.Cart;

import java.util.Map;

public class ViewCartAction {

    public String viewCart(){

        Map m = ActionContext.getContext().getSession();
        Cart cart = (Cart)m.get("cart");

        if(cart == null)
        {
            cart=new Cart();
            m.put("cart",cart);
        }

        m.put("cart",cart);
        m.put("cartNum",cart.getNumberOfItems());

        return "true";
    }
}
