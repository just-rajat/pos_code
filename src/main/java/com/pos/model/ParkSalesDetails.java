package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "park_sales_details")
public class ParkSalesDetails {
    @Id
    Integer prkSalesId;
    Integer quantity;
    Double lineTotal;
    Double perItemCost;
    String createBy;
    String modifyBy;
    Date createOn;
    Date modifyOn;
    Integer item;
    Integer parkSales;

    public Integer getPrkSalesId() {
        return prkSalesId;
    }

    public void setPrkSalesId(Integer prkSalesId) {
        this.prkSalesId = prkSalesId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public Integer getParkSales() {
        return parkSales;
    }

    public void setParkSales(Integer parkSales) {
        this.parkSales = parkSales;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ParkSalesDetails.class.getSimpleName() + "[", "]")
                .add("prkSalesId=" + prkSalesId)
                .add("quantity=" + quantity)
                .add("lineTotal=" + lineTotal)
                .add("perItemCost=" + perItemCost)
                .add("createBy='" + createBy + "'")
                .add("modifyBy='" + modifyBy + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .add("item=" + item)
                .add("parkSales=" + parkSales)
                .toString();
    }
}
