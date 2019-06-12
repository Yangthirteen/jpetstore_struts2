package domain;

import java.math.BigDecimal;

public class Item {
    private String ItemID;
    private String ProductID;
    private BigDecimal ListPrice;
    private BigDecimal UnitCost;
    private int SupplierId;
    private String Status;
    private String Attribute1;
    private String Attribute2;
    private String Attribute3;
    private String Attribute4;
    private String Attribute5;
    private Product Product;
    private int Quantity;

    public Item() {}

    public String getItemID() {
        return ItemID;
    }

    public void setItemID(String itemID) {
        ItemID = itemID;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String productID) {
        ProductID = productID;
    }

    public BigDecimal getListPrice() {
        return ListPrice;
    }

    public void setListPrice(BigDecimal listPrice) {
        ListPrice = listPrice;
    }

    public BigDecimal getUnitCost() {
        return UnitCost;
    }

    public void setUnitCost(BigDecimal unitCost) {
        UnitCost = unitCost;
    }

    public int getSupplierId() {
        return SupplierId;
    }

    public void setSupplierId(int supplierId) {
        SupplierId = supplierId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getAttribute1() {
        return Attribute1;
    }

    public void setAttribute1(String attribute1) {
        Attribute1 = attribute1;
    }

    public String getAttribute2() {
        return Attribute2;
    }

    public void setAttribute2(String attribute2) {
        Attribute2 = attribute2;
    }

    public String getAttribute3() {
        return Attribute3;
    }

    public void setAttribute3(String attribute3) {
        Attribute3 = attribute3;
    }

    public String getAttribute4() {
        return Attribute4;
    }

    public void setAttribute4(String attribute4) {
        Attribute4 = attribute4;
    }

    public String getAttribute5() {
        return Attribute5;
    }

    public void setAttribute5(String attribute5) {
        Attribute5 = attribute5;
    }

    public domain.Product getProduct() {
        return Product;
    }

    public void setProduct(domain.Product product) {
        Product = product;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public String toString(){
        return "("+getItemID()+"-"+getProductID()+")";
    }
}
