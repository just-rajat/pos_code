package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name="brand")
public class Brand {
    @Id
    Integer brand_id;
    String brandName;
    String brandDesc;
    Boolean isDelete;
    Integer items;
    String createdBy;
    String modifyBy;
    Date created_on;
    Date modify_on;

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandDesc() {
        return brandDesc;
    }

    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }

    public Date getModify_on() {
        return modify_on;
    }

    public void setModify_on(Date modify_on) {
        this.modify_on = modify_on;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Brand.class.getSimpleName() + "[", "]")
                .add("brand_id=" + brand_id)
                .add("brandName='" + brandName + "'")
                .add("brandDesc='" + brandDesc + "'")
                .add("isDelete=" + isDelete)
                .add("items=" + items)
                .add("createdBy='" + createdBy + "'")
                .add("modifyBy='" + modifyBy + "'")
                .add("created_on=" + created_on)
                .add("modify_on=" + modify_on)
                .toString();
    }
}
