package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "customer_history")
public class CustomerHistory {

    @Id
    Integer historyId;
    Integer sales_number;
    Date salesDate;
    Double salesTotal;
    Double balance;;
    Boolean isDelete;
    Integer paymentHistories;
    String createBy;
    String modifyBy;
    Date createOn;
    Date modifyOn;
    Integer customerID;
    Integer sales;
    Integer customerAccount;

    public Integer getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Integer historyId) {
        this.historyId = historyId;
    }

    public Integer getSales_number() {
        return sales_number;
    }

    public void setSales_number(Integer sales_number) {
        this.sales_number = sales_number;
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

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
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

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(Integer customerAccount) {
        this.customerAccount = customerAccount;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomerHistory.class.getSimpleName() + "[", "]")
                .add("historyId=" + historyId)
                .add("sales_number=" + sales_number)
                .add("salesDate=" + salesDate)
                .add("salesTotal=" + salesTotal)
                .add("balance=" + balance)
                .add("isDelete=" + isDelete)
                .add("paymentHistories=" + paymentHistories)
                .add("createBy='" + createBy + "'")
                .add("modifyBy='" + modifyBy + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .add("customerID=" + customerID)
                .add("sales=" + sales)
                .add("customerAccount=" + customerAccount)
                .toString();
    }
}
