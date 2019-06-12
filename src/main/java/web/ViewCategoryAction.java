package web;

import com.opensymphony.xwork2.ActionContext;
import domain.Category;
import domain.Product;
import service.CatelogService;

import java.util.List;
import java.util.Map;

public class ViewCategoryAction {

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    private String categoryID;
    public Category category = new Category();

    public String viewCategory(){

        CatelogService catalogService = new CatelogService();

        category = catalogService.getCategory(categoryID);
        List<Product> productList = catalogService.getProductListByCategory(categoryID);
        Map m = ActionContext.getContext().getSession();
        m.put("category",category);
        m.put("productList",productList);

        return "true";

    }
}
