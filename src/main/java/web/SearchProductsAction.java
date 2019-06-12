package web;

import com.opensymphony.xwork2.ActionContext;
import domain.Product;
import service.CatelogService;

import java.util.List;
import java.util.Map;

public class SearchProductsAction {

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    private String keyword;

    public String searchProducts(){

        Map m = ActionContext.getContext().getSession();
        m.put("keyword",keyword);
        CatelogService service=new CatelogService();
        List<Product> productList=service.searchProductList(keyword);
        m.put("productList",productList);

        return "true";
    }
}
