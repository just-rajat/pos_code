package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "temp_sales_details")
public class TempSalesDetails {

    @Id
    Integer salesDetailsId;
    Double qyt;
    Double lineTotal;
    Double perItemCost;
    String itemName;
    Double taxable;
    String createBy;
    Date createOn;
    Date modifyOn;
    Integer itemNumber;

    public Integer getSalesDetailsId() {
        return salesDetailsId;
    }

    public void setSalesDetailsId(Integer salesDetailsId) {
        this.salesDetailsId = salesDetailsId;
    }

    public Double getQyt() {
        return qyt;
    }

    public void setQyt(Double qyt) {
        this.qyt = qyt;
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

    public Double getTaxable() {
        return taxable;
    }

    public void setTaxable(Double taxable) {
        this.taxable = taxable;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
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

    public Integer getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(Integer itemNumber) {
        this.itemNumber = itemNumber;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", TempSalesDetails.class.getSimpleName() + "[", "]")
                .add("salesDetailsId=" + salesDetailsId)
                .add("qyt=" + qyt)
                .add("lineTotal=" + lineTotal)
                .add("perItemCost=" + perItemCost)
                .add("itemName='" + itemName + "'")
                .add("taxable=" + taxable)
                .add("createBy='" + createBy + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .add("itemNumber=" + itemNumber)
                .toString();
    }
}
