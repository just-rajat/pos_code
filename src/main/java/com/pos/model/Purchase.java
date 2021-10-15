package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "purchase")
public class Purchase {
    @Id
    Integer purchaseId;
    Integer purchaseNumber;
    Date purchaseDate;
    Double grandTotal;
    Boolean isDelete;
    Date orderDate;
    Integer purchaseDetailses;
    String createBy;
    String modifyBy;
    Date createOn;
    Date modifyOn;
    Integer pervPurchase;
    Integer supplier;

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Integer getPurchaseNumber() {
        return purchaseNumber;
    }

    public void setPurchaseNumber(Integer purchaseNumber) {
        this.purchaseNumber = purchaseNumber;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getPurchaseDetailses() {
        return purchaseDetailses;
    }

    public void setPurchaseDetailses(Integer purchaseDetailses) {
        this.purchaseDetailses = purchaseDetailses;
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

    public Integer getPervPurchase() {
        return pervPurchase;
    }

    public void setPervPurchase(Integer pervPurchase) {
        this.pervPurchase = pervPurchase;
    }

    public Integer getSupplier() {
        return supplier;
    }

    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Purchase.class.getSimpleName() + "[", "]")
                .add("purchaseId=" + purchaseId)
                .add("purchaseNumber=" + purchaseNumber)
                .add("purchaseDate=" + purchaseDate)
                .add("grandTotal=" + grandTotal)
                .add("isDelete=" + isDelete)
                .add("orderDate=" + orderDate)
                .add("purchaseDetailses=" + purchaseDetailses)
                .add("createBy='" + createBy + "'")
                .add("modifyBy='" + modifyBy + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .add("pervPurchase=" + pervPurchase)
                .add("supplier=" + supplier)
                .toString();
    }
}
