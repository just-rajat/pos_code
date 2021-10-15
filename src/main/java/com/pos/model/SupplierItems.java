package com.pos.model;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.hibernate.exception.DataException;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "supplier_items")
public class SupplierItems {
    @Id
    Integer supplierItemId;
    Bool isDelete;
    String createBy;
    String modifyBy;
    Date createOn;
    Date modifyOn;
    Integer item;
    Integer supplier;

    public Integer getSupplierItemId() {
        return supplierItemId;
    }

    public void setSupplierItemId(Integer supplierItemId) {
        this.supplierItemId = supplierItemId;
    }

    public Bool getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Bool isDelete) {
        this.isDelete = isDelete;
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

    public Integer getSupplier() {
        return supplier;
    }

    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SupplierItems.class.getSimpleName() + "[", "]")
                .add("supplierItemId=" + supplierItemId)
                .add("isDelete=" + isDelete)
                .add("createBy='" + createBy + "'")
                .add("modifyBy='" + modifyBy + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .add("item=" + item)
                .add("supplier=" + supplier)
                .toString();
    }
}
