package web;

import com.opensymphony.xwork2.ActionContext;
import domain.Item;
import service.CatelogService;

import java.util.Map;

public class ViewItemAction {

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    private String itemID;
    public String viewItem(){

        Map m = ActionContext.getContext().getSession();
        m.put("itemID",itemID);
        CatelogService service=new CatelogService();
        Item item=service.getItem(itemID);
        item.setQuantity(service.getItemQuantity(itemID));
        m.put("item",item);

        return "true";
    }
}
