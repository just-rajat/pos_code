package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "discount")
public class Discount {

    @Id
    Integer discountId;
    String discountName;
    String discountType;
    double discountPar;
    Boolean isDelete;
    String createBy;
    String modifyBy;
    Date createOn;
    Date modifyOn;

    public Integer getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Integer discountId) {
        this.discountId = discountId;
    }

    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public double getDiscountPar() {
        return discountPar;
    }

    public void setDiscountPar(double discountPar) {
        this.discountPar = discountPar;
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

    @Override
    public String toString() {
        return new StringJoiner(", ", Discount.class.getSimpleName() + "[", "]")
                .add("discountId=" + discountId)
                .add("discountName='" + discountName + "'")
                .add("discountType='" + discountType + "'")
                .add("discountPar=" + discountPar)
                .add("isDelete=" + isDelete)
                .add("createBy='" + createBy + "'")
                .add("modifyBy='" + modifyBy + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .toString();
    }
}
