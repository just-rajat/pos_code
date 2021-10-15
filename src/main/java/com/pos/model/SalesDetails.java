package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "sales_details")
public class SalesDetails {

    @Id
    Integer salesDetailsId;
    Double quantity;
    Double line_Total;
    Double perItemCost;
    Double taxable;
    String itemName;
    Boolean isDelete;
    String createBy;
    String modifyBy;
    Date createOn;
    Date modifyOn;
    Integer itemNumber;
    Integer salesID;

    public Integer getSalesDetailsId() {
        return salesDetailsId;
    }

    public void setSalesDetailsId(Integer salesDetailsId) {
        this.salesDetailsId = salesDetailsId;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getLine_Total() {
        return line_Total;
    }

    public void setLine_Total(Double line_Total) {
        this.line_Total = line_Total;
    }

    public Double getPerItemCost() {
        return perItemCost;
    }

    public void setPerItemCost(Double perItemCost) {
        this.perItemCost = perItemCost;
    }

    public Double getTaxable() {
        return taxable;
    }

    public void setTaxable(Double taxable) {
        this.taxable = taxable;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
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

    public Integer getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(Integer itemNumber) {
        this.itemNumber = itemNumber;
    }

    public Integer getSalesID() {
        return salesID;
    }

    public void setSalesID(Integer salesID) {
        this.salesID = salesID;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SalesDetails.class.getSimpleName() + "[", "]")
                .add("salesDetailsId=" + salesDetailsId)
                .add("quantity=" + quantity)
                .add("line_Total=" + line_Total)
                .add("perItemCost=" + perItemCost)
                .add("taxable=" + taxable)
                .add("itemName='" + itemName + "'")
                .add("isDelete=" + isDelete)
                .add("createBy='" + createBy + "'")
                .add("modifyBy='" + modifyBy + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .add("itemNumber=" + itemNumber)
                .add("salesID=" + salesID)
                .toString();
    }
}
