package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "customer_account")
public class CustomerAccount {
    @Id
    Integer accId;
    String account_type;
    String accountNo;
    Double creditLimit;
    Double avilBal;
    Boolean isDelete;
    Integer sales;
    Integer customerHistoriesID;
    String createBy;
    String modifyBy;
    Date createOn;
    Date modifyOn;
    Integer customer;

    public Integer getAccId() {
        return accId;
    }

    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Double getAvilBal() {
        return avilBal;
    }

    public void setAvilBal(Double avilBal) {
        this.avilBal = avilBal;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getCustomerHistoriesID() {
        return customerHistoriesID;
    }

    public void setCustomerHistoriesID(Integer customerHistoriesID) {
        this.customerHistoriesID = customerHistoriesID;
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

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomerAccount.class.getSimpleName() + "[", "]")
                .add("accId=" + accId)
                .add("account_type='" + account_type + "'")
                .add("accountNo='" + accountNo + "'")
                .add("creditLimit=" + creditLimit)
                .add("avilBal=" + avilBal)
                .add("isDelete=" + isDelete)
                .add("sales=" + sales)
                .add("customerHistoriesID=" + customerHistoriesID)
                .add("createBy='" + createBy + "'")
                .add("modifyBy='" + modifyBy + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .add("customer=" + customer)
                .toString();
    }
}
