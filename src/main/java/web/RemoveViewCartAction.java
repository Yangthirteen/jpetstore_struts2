package web;

import com.opensymphony.xwork2.ActionContext;
import domain.Cart;
import domain.Item;

import java.math.BigDecimal;
import java.util.Map;

public class RemoveViewCartAction {

    private String workingItemID;

    public String getWorkingItemID() {
        return workingItemID;
    }

    public void setWorkingItemID(String workingItemID) {
        this.workingItemID = workingItemID;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    private BigDecimal subTotal;

    public String removeViewCart(){

        Map m = ActionContext.getContext().getSession();
        Cart cart = (Cart)m.get("cart");
        Item item=cart.removeItemById(workingItemID);
        subTotal=cart.getSubTotal();

        m.put("workingItemID",workingItemID);
        m.put("cart",cart);
        m.put("subTotal",subTotal);
        m.put("cartNum",cart.getNumberOfItems());

        if(item==null)
        {
            m.put("massage","Attempted to remove null cartItem from cart");

            return "false";
        }
        else
        {
            return "true";
        }
    }
}
