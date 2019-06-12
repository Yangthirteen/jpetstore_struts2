package web;

import com.opensymphony.xwork2.ActionContext;
import domain.Item;
import domain.Product;
import service.CatelogService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ViewProductAction {

    public Product product = new Product();
    public List<Item> itemList = new ArrayList<>();

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    private String productID;
    public String viewProduct(){


        CatelogService catalogService = new CatelogService();
        itemList = catalogService.getItemListByProduct(productID);
        product = catalogService.getProduct(productID);
        Map m = ActionContext.getContext().getSession();
        m.put("product",product);
        m.put("itemList",itemList);

        return  "true";
    }

}
