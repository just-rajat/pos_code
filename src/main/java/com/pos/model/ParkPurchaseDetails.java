package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "park_purchase_details")
public class ParkPurchaseDetails {

    @Id
    Integer parkPurchaseDetailId;
    Double quantity;
    Date createBy;
    String ModifyBy;
    Date createOn;
    Date modifyOn;
    Integer item;
    Integer parkPurchase;

    public Integer getParkPurchaseDetailId() {
        return parkPurchaseDetailId;
    }

    public void setParkPurchaseDetailId(Integer parkPurchaseDetailId) {
        this.parkPurchaseDetailId = parkPurchaseDetailId;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Date getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Date createBy) {
        this.createBy = createBy;
    }

    public String getModifyBy() {
        return ModifyBy;
    }

    public void setModifyBy(String modifyBy) {
        ModifyBy = modifyBy;
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

    public Integer getParkPurchase() {
        return parkPurchase;
    }

    public void setParkPurchase(Integer parkPurchase) {
        this.parkPurchase = parkPurchase;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ParkPurchaseDetails.class.getSimpleName() + "[", "]")
                .add("parkPurchaseDetailId=" + parkPurchaseDetailId)
                .add("quantity=" + quantity)
                .add("createBy=" + createBy)
                .add("ModifyBy='" + ModifyBy + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .add("item=" + item)
                .add("parkPurchase=" + parkPurchase)
                .toString();
    }
}
