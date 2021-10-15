package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "park_purchase")
public class ParkPurchase {

    @Id
    Integer parkPurchaseId;
    String note;
    Date orderDate;
    Integer parkPurchaseDetailses;
    Boolean status;
    Boolean isDelete;
    String createBy;
    String modifyBy;
    Date createOn;
    Date modifyOn;
    Integer supplier;
    Integer pervPurchase;

    public Integer getParkPurchaseId() {
        return parkPurchaseId;
    }

    public void setParkPurchaseId(Integer parkPurchaseId) {
        this.parkPurchaseId = parkPurchaseId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getParkPurchaseDetailses() {
        return parkPurchaseDetailses;
    }

    public void setParkPurchaseDetailses(Integer parkPurchaseDetailses) {
        this.parkPurchaseDetailses = parkPurchaseDetailses;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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

    public Integer getSupplier() {
        return supplier;
    }

    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }

    public Integer getPervPurchase() {
        return pervPurchase;
    }

    public void setPervPurchase(Integer pervPurchase) {
        this.pervPurchase = pervPurchase;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ParkPurchase.class.getSimpleName() + "[", "]")
                .add("parkPurchaseId=" + parkPurchaseId)
                .add("note='" + note + "'")
                .add("orderDate=" + orderDate)
                .add("parkPurchaseDetailses=" + parkPurchaseDetailses)
                .add("status=" + status)
                .add("isDelete=" + isDelete)
                .add("createBy='" + createBy + "'")
                .add("modifyBy='" + modifyBy + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .add("supplier=" + supplier)
                .add("pervPurchase=" + pervPurchase)
                .toString();
    }
}
