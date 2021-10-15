package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "purchase_details")
public class PurchaseDetails {
    @Id
    Integer purchaseDetailsId;
    Double quantity;
    Double fullFillQty;
    Double lineTotal;
    Double erItemCost;
    String itemName;
    Boolean isDelete;
    String createBy;
    String modifyBy;
    Date createOn;
    Date modifyOn;
    Integer purchaseID;
    Integer item;

    public Integer getPurchaseDetailsId() {
        return purchaseDetailsId;
    }

    public void setPurchaseDetailsId(Integer purchaseDetailsId) {
        this.purchaseDetailsId = purchaseDetailsId;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getFullFillQty() {
        return fullFillQty;
    }

    public void setFullFillQty(Double fullFillQty) {
        this.fullFillQty = fullFillQty;
    }

    public Double getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(Double lineTotal) {
        this.lineTotal = lineTotal;
    }

    public Double getErItemCost() {
        return erItemCost;
    }

    public void setErItemCost(Double erItemCost) {
        this.erItemCost = erItemCost;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
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

    public Integer getPurchaseID() {
        return purchaseID;
    }

    public void setPurchaseID(Integer purchaseID) {
        this.purchaseID = purchaseID;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", PurchaseDetails.class.getSimpleName() + "[", "]")
                .add("purchaseDetailsId=" + purchaseDetailsId)
                .add("quantity=" + quantity)
                .add("fullFillQty=" + fullFillQty)
                .add("lineTotal=" + lineTotal)
                .add("erItemCost=" + erItemCost)
                .add("itemName='" + itemName + "'")
                .add("isDelete=" + isDelete)
                .add("createBy='" + createBy + "'")
                .add("modifyBy='" + modifyBy + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .add("purchaseID=" + purchaseID)
                .add("item=" + item)
                .toString();
    }
}
