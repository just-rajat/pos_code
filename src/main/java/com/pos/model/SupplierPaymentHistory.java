package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "supplier_payment_history")
public class SupplierPaymentHistory {

    @Id
    Integer paymentId;
    Date paymentDate;
    String paymentType;
    String ReferenceNumber;
    Double paymentAmount;
    Double balanceDue;
    Double paidInFull;
    Boolean isDelete;
    String createBy;
    String modifyBy;
    Date createOn;
    Date modifyOn;
    Integer supplierHistoryID;

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getReferenceNumber() {
        return ReferenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        ReferenceNumber = referenceNumber;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Double getBalanceDue() {
        return balanceDue;
    }

    public void setBalanceDue(Double balanceDue) {
        this.balanceDue = balanceDue;
    }

    public Double getPaidInFull() {
        return paidInFull;
    }

    public void setPaidInFull(Double paidInFull) {
        this.paidInFull = paidInFull;
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

    public Integer getSupplierHistoryID() {
        return supplierHistoryID;
    }

    public void setSupplierHistoryID(Integer supplierHistoryID) {
        this.supplierHistoryID = supplierHistoryID;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SupplierPaymentHistory.class.getSimpleName() + "[", "]")
                .add("paymentId=" + paymentId)
                .add("paymentDate=" + paymentDate)
                .add("paymentType='" + paymentType + "'")
                .add("ReferenceNumber='" + ReferenceNumber + "'")
                .add("paymentAmount=" + paymentAmount)
                .add("balanceDue=" + balanceDue)
                .add("paidInFull=" + paidInFull)
                .add("isDelete=" + isDelete)
                .add("createBy='" + createBy + "'")
                .add("modifyBy='" + modifyBy + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .add("supplierHistoryID=" + supplierHistoryID)
                .toString();
    }
}
