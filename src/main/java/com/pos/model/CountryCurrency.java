package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name="country_currency")
public class CountryCurrency {

    @Id
    Integer curencyId;
    String categoryId;
    String createBy;
    String nodifyId;
    Date createOn;
    Date modifyOn;

    public Integer getCurencyId() {
        return curencyId;
    }

    public void setCurencyId(Integer curencyId) {
        this.curencyId = curencyId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getNodifyId() {
        return nodifyId;
    }

    public void setNodifyId(String nodifyId) {
        this.nodifyId = nodifyId;
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
        return new StringJoiner(", ", CountryCurrency.class.getSimpleName() + "[", "]")
                .add("curencyId=" + curencyId)
                .add("categoryId='" + categoryId + "'")
                .add("createBy='" + createBy + "'")
                .add("nodifyId='" + nodifyId + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .toString();
    }
}
