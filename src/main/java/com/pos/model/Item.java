package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Arrays;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "item")
public class Item {

    @Id
    Integer itemId;
    String itemNumber;
    String itemName;
    String itemDec;
    Double quantity;
    Double purchasePrice;
    Double sellingPrice;
    Integer minimumInStock;
    Byte[] image;
    Boolean isDelete;
    Boolean isActive;
    Date date;
    Integer taxOnItems;
    Integer supplierItems;
    String createBy;
    String modifyBy;
    Date createOn;
    Date modifyOn;
    Integer productID;
    Integer brandID;
    Integer itemMeasures;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDec() {
        return itemDec;
    }

    public void setItemDec(String itemDec) {
        this.itemDec = itemDec;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Integer getMinimumInStock() {
        return minimumInStock;
    }

    public void setMinimumInStock(Integer minimumInStock) {
        this.minimumInStock = minimumInStock;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getTaxOnItems() {
        return taxOnItems;
    }

    public void setTaxOnItems(Integer taxOnItems) {
        this.taxOnItems = taxOnItems;
    }

    public Integer getSupplierItems() {
        return supplierItems;
    }

    public void setSupplierItems(Integer supplierItems) {
        this.supplierItems = supplierItems;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Date createOn) {
        this.createOn = createOn;
    }

    public Date getModifyOn() {
        return modifyOn;
    }

    public void setModifyOn(Date modifyOn) {
        this.modifyOn = modifyOn;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Integer getBrandID() {
        return brandID;
    }

    public void setBrandID(Integer brandID) {
        this.brandID = brandID;
    }

    public Integer getItemMeasures() {
        return itemMeasures;
    }

    public void setItemMeasures(Integer itemMeasures) {
        this.itemMeasures = itemMeasures;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Item.class.getSimpleName() + "[", "]")
                .add("itemId=" + itemId)
                .add("itemNumber='" + itemNumber + "'")
                .add("itemName='" + itemName + "'")
                .add("itemDec='" + itemDec + "'")
                .add("quantity=" + quantity)
                .add("purchasePrice=" + purchasePrice)
                .add("sellingPrice=" + sellingPrice)
                .add("minimumInStock=" + minimumInStock)
                .add("image=" + Arrays.toString(image))
                .add("isDelete=" + isDelete)
                .add("isActive=" + isActive)
                .add("date=" + date)
                .add("taxOnItems=" + taxOnItems)
                .add("supplierItems=" + supplierItems)
                .add("createBy='" + createBy + "'")
                .add("modifyBy='" + modifyBy + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .add("productID=" + productID)
                .add("brandID=" + brandID)
                .add("itemMeasures=" + itemMeasures)
                .toString();
    }
}
