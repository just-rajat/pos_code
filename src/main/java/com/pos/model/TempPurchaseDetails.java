package com.pos.model;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "temp_purchase_details")
public class TempPurchaseDetails {
    @Id
    Integer purchaseDetailsId;
    Double quantity;
    Double RemainQty;
    Boolean status;
    Double lineTotal;
    Double perItemCost;
    String itemName;
    String createBy;
    String modifyBy;
    Date createOn;
    Date modifyOn;

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

    public Double getRemainQty() {
        return RemainQty;
    }

    public void setRemainQty(Double remainQty) {
        RemainQty = remainQty;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Double getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(Double lineTotal) {
        this.lineTotal = lineTotal;
    }

    public Double getPerItemCost() {
        return perItemCost;
    }

    public void setPerItemCost(Double perItemCost) {
        this.perItemCost = perItemCost;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
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

    @Override
    public String toString() {
        return new StringJoiner(", ", TempPurchaseDetails.class.getSimpleName() + "[", "]")
                .add("purchaseDetailsId=" + purchaseDetailsId)
                .add("quantity=" + quantity)
                .add("RemainQty=" + RemainQty)
                .add("status=" + status)
                .add("lineTotal=" + lineTotal)
                .add("perItemCost=" + perItemCost)
                .add("itemName='" + itemName + "'")
                .add("createBy='" + createBy + "'")
                .add("modifyBy='" + modifyBy + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .toString();
    }
}
