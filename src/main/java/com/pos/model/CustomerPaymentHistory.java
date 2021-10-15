package com.pos.model;

import com.pos.repository.StoreBannerRepository;
import com.pos.service.StoreBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "customer_payment_history")
public class CustomerPaymentHistory {

    @Id
    Integer paymentId;
    Date paymentDate;
    Double paymentAmount;
    Double balanceDue;
    Boolean paidInFull;
    String paymentMethod;
    Boolean isDelete;
    String createBy;
    String modifyBy;
    Date createOn;
    Date modifyOn;
    Integer customerHistoryID;

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Double getBalanceDue() {
        return balanceDue;
    }

    public void setBalanceDue(Double balanceDue) {
        this.balanceDue = balanceDue;
    }

    public Boolean getPaidInFull() {
        return paidInFull;
    }

    public void setPaidInFull(Boolean paidInFull) {
        this.paidInFull = paidInFull;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
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

    public Integer getCustomerHistoryID() {
        return customerHistoryID;
    }

    public void setCustomerHistoryID(Integer customerHistoryID) {
        this.customerHistoryID = customerHistoryID;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomerPaymentHistory.class.getSimpleName() + "[", "]")
                .add("paymentId=" + paymentId)
                .add("paymentDate=" + paymentDate)
                .add("paymentAmount=" + paymentAmount)
                .add("balanceDue=" + balanceDue)
                .add("paidInFull=" + paidInFull)
                .add("paymentMethod='" + paymentMethod + "'")
                .add("isDelete=" + isDelete)
                .add("createBy='" + createBy + "'")
                .add("modifyBy='" + modifyBy + "'")
                .add("createOn=" + createOn)
                .add("modifyOn=" + modifyOn)
                .add("customerHistoryID=" + customerHistoryID)
                .toString();
    }

    @Service
    public static class StoreBannerServiceImpl implements StoreBannerService {
        @Autowired
        StoreBannerRepository storeBannerRepository;

        @Override
        public StoreBanner addStoreBanner(StoreBanner storeBanner) {
            return storeBannerRepository.save(storeBanner);
        }
    }
}
