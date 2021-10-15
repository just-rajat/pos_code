package com.pos.model;

import org.hibernate.exception.DataException;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "supplier_history")
public class SupplierHistory {

    @Id
    Integer historyId;
    Integer purchaseOrderNo;
    Date purchaseTotal;
    Double balanceDue;
    Boolean isDelete;
    Integer paymentHistories;
    String createBy;
    String modifyBy;
    Date createOn;
    Date modifyOn;
    Integer supplierID;
    Integer purchase;

    public Integer getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Integer historyId) {
        this.historyId = historyId;
    }

    public Integer getPurchaseOrderNo() {
        return purchaseOrderNo;
    }

    public void setPurchaseOrderNo(Integer purchaseOrderNo) {
        this.purchaseOrderNo = purchaseOrderNo;
    }

    public Date getPurchaseTotal() {
        return purchaseTotal;
    }

    public void setPurchaseTotal(Date purchaseTotal) {
        this.purchaseTotal = purchaseTotal;
    }

    public Double getBalanceDue() {
        return balanceDue;
    }

    public void setBalanceDue(Double balanceDue) {
        this.balanceDue = balanceDue;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public Integer getPaymentHistories() {
        return paymentHistories;
    }

    public void setPaymentHistories(Integer paymentHistories) {
        this.paymentHistories = paymentHistories;
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

    public Integer getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(Integer supplierID) {
        this.supplierID = supplierID;
    }

    public Integer getPurchase() {
        return purchase;
    }

    public void setPurchase(Integer purchase) {
        this.purchase = purchase;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SupplierHistory.class.getSimpleName() + "[", "]")
                .add("historyId=" + historyId)
                .add("purchaseOrderNo=" + purchaseOrderNo)
                .add("purchaseTotal=" + purchaseTotal)
                .add("balanceDue=" + balanceDue)
                .add("isDelete=" + isDelete)
                .add("paymentHistories=" + paymentHistories)
                .add("createBy='" + createBy + "'")
                .add("modifyBy='" + modifyBy + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .add("supplierID=" + supplierID)
                .add("purchase=" + purchase)
                .toString();
    }
}
