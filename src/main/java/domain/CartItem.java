package domain;

import java.math.BigDecimal;

public class CartItem {
    private Item item;
    private int quantity=0;
    private boolean inStock;
    private BigDecimal total;

    public CartItem(){}

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
    public void incrementQuantity(){
        quantity++;
        calculateTotal();
    }
    public void calculateTotal(){
        if(item!=null&&item.getListPrice()!=null)
        {
            total=item.getListPrice().multiply(new BigDecimal(quantity));
        }
        else{
            total=null;
        }
    }
}
