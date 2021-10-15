package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "sales")
public class Sales {

    @Id
    Integer salesId;
    Integer salesNumber;
    Date salesDate;
    Double salesTotal;
    Double salesTaxTotal;;
    Double salesDiscount;
    Double grandTotal;
    Boolean isDelete;
    Boolean deliveryStatus;
    Double deliveryCharge;
    Double deliveryTax;
    Integer salesDetailses;
    Integer customerHistories;
    String createBy;
    String modifyBy;
    Date createOn;
    Date modifyOn;
    Integer customer;
    Integer customerAccount;

    public Integer getSalesId() {
        return salesId;
    }

    public void setSalesId(Integer salesId) {
        this.salesId = salesId;
    }

    public Integer getSalesNumber() {
        return salesNumber;
    }

    public void setSalesNumber(Integer salesNumber) {
        this.salesNumber = salesNumber;
    }

    public Date getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }

    public Double getSalesTotal() {
        return salesTotal;
    }

    public void setSalesTotal(Double salesTotal) {
        this.salesTotal = salesTotal;
    }

    public Double getSalesTaxTotal() {
        return salesTaxTotal;
    }

    public void setSalesTaxTotal(Double salesTaxTotal) {
        this.salesTaxTotal = salesTaxTotal;
    }

    public Double getSalesDiscount() {
        return salesDiscount;
    }

    public void setSalesDiscount(Double salesDiscount) {
        this.salesDiscount = salesDiscount;
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

    public Boolean getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(Boolean deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public Double getDeliveryCharge() {
        return deliveryCharge;
    }

    public void setDeliveryCharge(Double deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
    }

    public Double getDeliveryTax() {
        return deliveryTax;
    }

    public void setDeliveryTax(Double deliveryTax) {
        this.deliveryTax = deliveryTax;
    }

    public Integer getSalesDetailses() {
        return salesDetailses;
    }

    public void setSalesDetailses(Integer salesDetailses) {
        this.salesDetailses = salesDetailses;
    }

    public Integer getCustomerHistories() {
        return customerHistories;
    }

    public void setCustomerHistories(Integer customerHistories) {
        this.customerHistories = customerHistories;
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

    public Integer getCustomer() {
        return customer;
    }

    public void setCustomer(Integer customer) {
        this.customer = customer;
    }

    public Integer getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(Integer customerAccount) {
        this.customerAccount = customerAccount;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Sales.class.getSimpleName() + "[", "]")
                .add("salesId=" + salesId)
                .add("salesNumber=" + salesNumber)
                .add("salesDate=" + salesDate)
                .add("salesTotal=" + salesTotal)
                .add("salesTaxTotal=" + salesTaxTotal)
                .add("salesDiscount=" + salesDiscount)
                .add("grandTotal=" + grandTotal)
                .add("isDelete=" + isDelete)
                .add("deliveryStatus=" + deliveryStatus)
                .add("deliveryCharge=" + deliveryCharge)
                .add("deliveryTax=" + deliveryTax)
                .add("salesDetailses=" + salesDetailses)
                .add("customerHistories=" + customerHistories)
                .add("createBy='" + createBy + "'")
                .add("modifyBy='" + modifyBy + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .add("customer=" + customer)
                .add("customerAccount=" + customerAccount)
                .toString();
    }
}
