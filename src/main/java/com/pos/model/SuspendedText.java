package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "suspended_text")
public class SuspendedText {
    @Id
    Integer suspendID;
    String suspendText;
    Date suspendDate;
    String createBy;
    String modifyBy;
    Date createOn;
    Date modifyOn;
    Integer itemId;

    public Integer getSuspendID() {
        return suspendID;
    }

    public void setSuspendID(Integer suspendID) {
        this.suspendID = suspendID;
    }

    public String getSuspendText() {
        return suspendText;
    }

    public void setSuspendText(String suspendText) {
        this.suspendText = suspendText;
    }

    public Date getSuspendDate() {
        return suspendDate;
    }

    public void setSuspendDate(Date suspendDate) {
        this.suspendDate = suspendDate;
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

    @Override
    public String toString() {
        return new StringJoiner(", ", SuspendedText.class.getSimpleName() + "[", "]")
                .add("suspendID=" + suspendID)
                .add("suspendText='" + suspendText + "'")
                .add("suspendDate=" + suspendDate)
                .add("createBy='" + createBy + "'")
                .add("modifyBy='" + modifyBy + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .add("itemId=" + itemId)
                .toString();
    }
}
