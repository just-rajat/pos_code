package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "temp_sales")
public class TempSales {

    @Id
    Integer salesId;
    Integer salesNumber;
    Date salesDate;
    Double salesTotal;
    Double salesTaxTotal;
    Double salesDiscount;
    Double grandTotal;
    Boolean isDelete;
    String createBy;
    String modifyBy;
    Date createOn;
    Date modifyOn;
    Integer customerAccount;
    Integer customer;

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

    public Integer getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(Integer customerAccount) {
        this.customerAccount = customerAccount;
    }

    public Integer getCustomer() {
        return customer;
    }

    public void setCustomer(Integer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", TempSales.class.getSimpleName() + "[", "]")
                .add("salesId=" + salesId)
                .add("salesNumber=" + salesNumber)
                .add("salesDate=" + salesDate)
                .add("salesTotal=" + salesTotal)
                .add("salesTaxTotal=" + salesTaxTotal)
                .add("salesDiscount=" + salesDiscount)
                .add("grandTotal=" + grandTotal)
                .add("isDelete=" + isDelete)
                .add("createBy='" + createBy + "'")
                .add("modifyBy='" + modifyBy + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .add("customerAccount=" + customerAccount)
                .add("customer=" + customer)
                .toString();
    }
}
