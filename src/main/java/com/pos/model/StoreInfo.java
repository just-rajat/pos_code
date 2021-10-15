package com.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "store_info")
public class StoreInfo {

    @Id
    Integer storeId;
    String storeName;
    String phone;
    String Mobile;
    String fax;
    String eMail;
    String website;
    String address;
    String city;
    String state;
    String zipCode;
    String country;
    String extraText;
    Boolean header;
    Boolean printDetails;
    Boolean printAddress;
    Boolean printExtra;
    Boolean isPdfView;
    String gst;
    String pan_no;
    String createBy;
    String modifyBy;
    String deliveryTax;
    Date createOn;
    Date modifyOn;

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
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

    public String getExtraText() {
        return extraText;
    }

    public void setExtraText(String extraText) {
        this.extraText = extraText;
    }

    public Boolean getHeader() {
        return header;
    }

    public void setHeader(Boolean header) {
        this.header = header;
    }

    public Boolean getPrintDetails() {
        return printDetails;
    }

    public void setPrintDetails(Boolean printDetails) {
        this.printDetails = printDetails;
    }

    public Boolean getPrintAddress() {
        return printAddress;
    }

    public void setPrintAddress(Boolean printAddress) {
        this.printAddress = printAddress;
    }

    public Boolean getPrintExtra() {
        return printExtra;
    }

    public void setPrintExtra(Boolean printExtra) {
        this.printExtra = printExtra;
    }

    public Boolean getPdfView() {
        return isPdfView;
    }

    public void setPdfView(Boolean pdfView) {
        isPdfView = pdfView;
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

    public String getDeliveryTax() {
        return deliveryTax;
    }

    public void setDeliveryTax(String deliveryTax) {
        this.deliveryTax = deliveryTax;
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
        return new StringJoiner(", ", StoreInfo.class.getSimpleName() + "[", "]")
                .add("storeId=" + storeId)
                .add("storeName='" + storeName + "'")
                .add("phone='" + phone + "'")
                .add("Mobile='" + Mobile + "'")
                .add("fax='" + fax + "'")
                .add("eMail='" + eMail + "'")
                .add("website='" + website + "'")
                .add("address='" + address + "'")
                .add("city='" + city + "'")
                .add("state='" + state + "'")
                .add("zipCode='" + zipCode + "'")
                .add("country='" + country + "'")
                .add("extraText='" + extraText + "'")
                .add("header=" + header)
                .add("printDetails=" + printDetails)
                .add("printAddress=" + printAddress)
                .add("printExtra=" + printExtra)
                .add("isPdfView=" + isPdfView)
                .add("gst='" + gst + "'")
                .add("pan_no='" + pan_no + "'")
                .add("createBy='" + createBy + "'")
                .add("modifyBy='" + modifyBy + "'")
                .add("deliveryTax='" + deliveryTax + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .toString();
    }
}
