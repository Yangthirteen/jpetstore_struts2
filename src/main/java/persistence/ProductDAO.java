package persistence;

import domain.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> getProductListByCategory(String categoryID);

    Product getProduct(String productID);

    List<Product> searchProductList(String keywords);
}
