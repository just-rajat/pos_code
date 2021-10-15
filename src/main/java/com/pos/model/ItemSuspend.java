package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "item_suspend")
public class ItemSuspend {

    @Id
    Integer itemSuspendID;
    String createBy;
    String modifyBy;
    Date createOn;
    Date modifyOn;
    Integer itemId;
    String suspendedText;

    public Integer getItemSuspendID() {
        return itemSuspendID;
    }

    public void setItemSuspendID(Integer itemSuspendID) {
        this.itemSuspendID = itemSuspendID;
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

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getSuspendedText() {
        return suspendedText;
    }

    public void setSuspendedText(String suspendedText) {
        this.suspendedText = suspendedText;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ItemSuspend.class.getSimpleName() + "[", "]")
                .add("itemSuspendID=" + itemSuspendID)
                .add("createBy='" + createBy + "'")
                .add("modifyBy='" + modifyBy + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .add("itemId=" + itemId)
                .add("suspendedText='" + suspendedText + "'")
                .toString();
    }
}
