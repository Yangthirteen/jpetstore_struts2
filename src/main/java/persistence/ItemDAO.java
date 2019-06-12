package persistence;

import domain.Item;

import java.util.List;

public interface ItemDAO {
    void updateInventoryQuantity(String itemID, int increment);

    int getInventoryQuantity(String itemID);

    List<Item> getItemListByProduct(String productID);

    Item getItem(String itemID);

}
