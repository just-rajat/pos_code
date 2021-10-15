package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "tax")
public class Tax {
    @Id
    Integer taxId;
    String taxName;
    Double taxPercent;
    String taxDes;
    Boolean isDelete;
    Integer taxOnItems;
    String createBy;
    String modifyBy;
    Date createOn;
    Date modifyOn;

    public Integer getTaxId() {
        return taxId;
    }

    public void setTaxId(Integer taxId) {
        this.taxId = taxId;
    }

    public String getTaxName() {
        return taxName;
    }

    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    public Double getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(Double taxPercent) {
        this.taxPercent = taxPercent;
    }

    public String getTaxDes() {
        return taxDes;
    }

    public void setTaxDes(String taxDes) {
        this.taxDes = taxDes;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public Integer getTaxOnItems() {
        return taxOnItems;
    }

    public void setTaxOnItems(Integer taxOnItems) {
        this.taxOnItems = taxOnItems;
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

    @Override
    public String toString() {
        return new StringJoiner(", ", Tax.class.getSimpleName() + "[", "]")
                .add("taxId=" + taxId)
                .add("taxName='" + taxName + "'")
                .add("taxPercent=" + taxPercent)
                .add("taxDes='" + taxDes + "'")
                .add("isDelete=" + isDelete)
                .add("taxOnItems=" + taxOnItems)
                .add("createBy='" + createBy + "'")
                .add("modifyBy='" + modifyBy + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .toString();
    }
}
