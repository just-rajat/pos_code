package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "supplier")
public class Supplier {

    @Id
    Integer supplierId;
    String supplierName;
    String company;
    String phoneNo;
    String eMail;
    String address;
    String city;
    String state;
    String zipCode;
    String country;
    Boolean isDelete;
    String gst;
    String pan_no;
    Integer supplierHistoriesID;
    Integer supplierItems;
    String createBy;
    String modifyBy;
    Date createOn;
    Date modifyOn;

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public String getPan_no() {
        return pan_no;
    }

    public void setPan_no(String pan_no) {
        this.pan_no = pan_no;
    }

    public Integer getSupplierHistoriesID() {
        return supplierHistoriesID;
    }

    public void setSupplierHistoriesID(Integer supplierHistoriesID) {
        this.supplierHistoriesID = supplierHistoriesID;
    }

    public Integer getSupplierItems() {
        return supplierItems;
    }

    public void setSupplierItems(Integer supplierItems) {
        this.supplierItems = supplierItems;
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

    @Override
    public String toString() {
        return new StringJoiner(", ", Supplier.class.getSimpleName() + "[", "]")
                .add("supplierId=" + supplierId)
                .add("supplierName='" + supplierName + "'")
                .add("company='" + company + "'")
                .add("phoneNo='" + phoneNo + "'")
                .add("eMail='" + eMail + "'")
                .add("address='" + address + "'")
                .add("city='" + city + "'")
                .add("state='" + state + "'")
                .add("zipCode='" + zipCode + "'")
                .add("country='" + country + "'")
                .add("isDelete=" + isDelete)
                .add("gst='" + gst + "'")
                .add("pan_no='" + pan_no + "'")
                .add("supplierHistoriesID=" + supplierHistoriesID)
                .add("supplierItems=" + supplierItems)
                .add("createBy='" + createBy + "'")
                .add("modifyBy='" + modifyBy + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .toString();
    }

    public void setModifyOn(Date modifyOn) {
        this.modifyOn = modifyOn;
    }


}
