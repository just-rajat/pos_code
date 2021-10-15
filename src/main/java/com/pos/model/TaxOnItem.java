package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.StringJoiner;

@Entity
@Table(name = "tax_on_item")
public class TaxOnItem {

    @Id
    Integer taxOnItemId;
    Boolean isDelete;
    String createBy;
    String modifyBy;
    String taxID;
    Integer itemID;
    Boolean setDelete;

    public Integer getTaxOnItemId() {
        return taxOnItemId;
    }

    public void setTaxOnItemId(Integer taxOnItemId) {
        this.taxOnItemId = taxOnItemId;
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

    public String getTaxID() {
        return taxID;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public Integer getItemID() {
        return itemID;
    }

    public void setItemID(Integer itemID) {
        this.itemID = itemID;
    }

    public Boolean getSetDelete() {
        return setDelete;
    }

    public void setSetDelete(Boolean setDelete) {
        this.setDelete = setDelete;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", TaxOnItem.class.getSimpleName() + "[", "]")
                .add("taxOnItemId=" + taxOnItemId)
                .add("isDelete=" + isDelete)
                .add("createBy='" + createBy + "'")
                .add("modifyBy='" + modifyBy + "'")
                .add("taxID='" + taxID + "'")
                .add("itemID=" + itemID)
                .add("setDelete=" + setDelete)
                .toString();
    }
}
