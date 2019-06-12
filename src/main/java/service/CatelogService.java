package service;

import domain.Category;
import domain.Item;
import domain.Product;
import persistence.CategoryDAO;
import persistence.ItemDAO;
import persistence.ProductDAO;
import persistence.impl.CategoryDAOImpl;
import persistence.impl.ItemDAOImpl;
import persistence.impl.ProductDAOImpl;

import java.util.List;

public class CatelogService {
    private CategoryDAO categoryDAO;
    private ProductDAO productDAO;
    private ItemDAO itemDAO;

    public CatelogService()
    {
        categoryDAO=new CategoryDAOImpl();
        productDAO=new ProductDAOImpl();
        itemDAO=new ItemDAOImpl();
    }

    public List<Category> getCategoryList(){
        return categoryDAO.getCategoryList();
    }
    public  Category getCategory(String categoryID)
    {
        return categoryDAO.getCategory(categoryID);
    }
    public Product getProduct(String productID)
    {
        return productDAO.getProduct(productID);
    }
    public List<Product> getProductListByCategory(String categoryID)
    {
        return productDAO.getProductListByCategory(categoryID);
    }
    public List<Product> searchProductList(String keyword)
    {
        return productDAO.searchProductList("%"+keyword.toLowerCase()+"%");
    }
    public List<Item> getItemListByProduct(String productID){
        return itemDAO.getItemListByProduct(productID);
    }
    public Item getItem(String itemID){
        return itemDAO.getItem(itemID);
    }
    public boolean isItemInStock(String itemID){
        return itemDAO.getInventoryQuantity(itemID) > 0;
    }
    public int getItemQuantity(String itemID){ return itemDAO.getInventoryQuantity(itemID); }

}
