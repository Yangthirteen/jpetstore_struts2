package web;

import com.opensymphony.xwork2.ActionContext;
import domain.Cart;
import domain.CartItem;
import domain.Order;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class AddNewOrderAction {

    public Order order = new Order();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;
    public Cart cart = new Cart();

    public String addNewOrder() {

        Map m = ActionContext.getContext().getSession();
        m.put("username",username);
        List<CartItem> cartItems;
        m.put("cart",cart);
        cartItems=cart.getCartItemList();
        for(int i=0;i<cartItems.size();i++)
        {
            CartItem cartItem=cartItems.get(i);
            order.addLineItem(cartItem);
        }

        m.put("order",order);

        return "true";
    }
}
