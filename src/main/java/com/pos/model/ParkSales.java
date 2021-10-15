package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "park_sales")
public class ParkSales {

    @Id
    Integer parkSalesId;
    Date salesDate;
    Date grandTotal;
    Integer parkSalesDetails;
    String createBy;
    String modifyBy;
    Date createOn;
    Date modifyOn;
    Integer customer;

    public Integer getParkSalesId() {
        return parkSalesId;
    }

    public void setParkSalesId(Integer parkSalesId) {
        this.parkSalesId = parkSalesId;
    }

    public Date getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }

    public Date getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Date grandTotal) {
        this.grandTotal = grandTotal;
    }

    public Integer getParkSalesDetails() {
        return parkSalesDetails;
    }

    public void setParkSalesDetails(Integer parkSalesDetails) {
        this.parkSalesDetails = parkSalesDetails;
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
        return new StringJoiner(", ", ParkSales.class.getSimpleName() + "[", "]")
                .add("parkSalesId=" + parkSalesId)
                .add("salesDate=" + salesDate)
                .add("grandTotal=" + grandTotal)
                .add("parkSalesDetails=" + parkSalesDetails)
                .add("createBy='" + createBy + "'")
                .add("modifyBy='" + modifyBy + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .add("customer=" + customer)
                .toString();
    }
}
