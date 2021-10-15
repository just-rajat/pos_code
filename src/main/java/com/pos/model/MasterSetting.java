package com.pos.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "master_setting")
public class MasterSetting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "auto_gen")
    @SequenceGenerator(name = "auto_gen", sequenceName = "master_setting_id_seq",allocationSize = 1)
    Integer s_id;
    byte[] logo;
    byte[] back_image;
    String user_location;
    String user_latitude;
    String user_longitude;
    Boolean show_out_stock;
    Boolean show_tax_split;
    Boolean item_grouping;
    String item_grouping_attr;
    String facebook_url;
    String instagram_url;
    String twitter_url;
    Boolean enable_cancellation;
    Boolean enable_customer_cancellation;
    Integer max_time;
    String applicable_order_status_cust;
    Boolean enable_del_partner_can;
    Integer max_bandwidth_time;
    String applicable_order_status_deli;
    Date created_on;
    Date modified_on;

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public byte[] getBack_image() {
        return back_image;
    }

    public void setBack_image(byte[] back_image) {
        this.back_image = back_image;
    }

    public String getUser_location() {
        return user_location;
    }

    public void setUser_location(String user_location) {
        this.user_location = user_location;
    }

    public String getUser_latitude() {
        return user_latitude;
    }

    public void setUser_latitude(String user_latitude) {
        this.user_latitude = user_latitude;
    }

    public String getUser_longitude() {
        return user_longitude;
    }

    public void setUser_longitude(String user_longitude) {
        this.user_longitude = user_longitude;
    }

    public Boolean getShow_out_stock() {
        return show_out_stock;
    }

    public void setShow_out_stock(Boolean show_out_stock) {
        this.show_out_stock = show_out_stock;
    }

    public Boolean getShow_tax_split() {
        return show_tax_split;
    }

    public void setShow_tax_split(Boolean show_tax_split) {
        this.show_tax_split = show_tax_split;
    }

    public Boolean getItem_grouping() {
        return item_grouping;
    }

    public void setItem_grouping(Boolean item_grouping) {
        this.item_grouping = item_grouping;
    }

    public String getItem_grouping_attr() {
        return item_grouping_attr;
    }

    public void setItem_grouping_attr(String item_grouping_attr) {
        this.item_grouping_attr = item_grouping_attr;
    }

    public String getFacebook_url() {
        return facebook_url;
    }

    public void setFacebook_url(String facebook_url) {
        this.facebook_url = facebook_url;
    }

    public String getInstagram_url() {
        return instagram_url;
    }

    public void setInstagram_url(String instagram_url) {
        this.instagram_url = instagram_url;
    }

    public String getTwitter_url() {
        return twitter_url;
    }

    public void setTwitter_url(String twitter_url) {
        this.twitter_url = twitter_url;
    }

    public Boolean getEnable_cancellation() {
        return enable_cancellation;
    }

    public void setEnable_cancellation(Boolean enable_cancellation) {
        this.enable_cancellation = enable_cancellation;
    }

    public Boolean getEnable_customer_cancellation() {
        return enable_customer_cancellation;
    }

    public void setEnable_customer_cancellation(Boolean enable_customer_cancellation) {
        this.enable_customer_cancellation = enable_customer_cancellation;
    }

    public Integer getMax_time() {
        return max_time;
    }

    public void setMax_time(Integer max_time) {
        this.max_time = max_time;
    }

    public String getApplicable_order_status_cust() {
        return applicable_order_status_cust;
    }

    public void setApplicable_order_status_cust(String applicable_order_status_cust) {
        this.applicable_order_status_cust = applicable_order_status_cust;
    }

    public Boolean getEnable_del_partner_can() {
        return enable_del_partner_can;
    }

    public void setEnable_del_partner_can(Boolean enable_del_partner_can) {
        this.enable_del_partner_can = enable_del_partner_can;
    }

    public Integer getMax_bandwidth_time() {
        return max_bandwidth_time;
    }

    public void setMax_bandwidth_time(Integer max_bandwidth_time) {
        this.max_bandwidth_time = max_bandwidth_time;
    }

    public String getApplicable_order_status_deli() {
        return applicable_order_status_deli;
    }

    public void setApplicable_order_status_deli(String applicable_order_status_deli) {
        this.applicable_order_status_deli = applicable_order_status_deli;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }

    public Date getModified_on() {
        return modified_on;
    }

    public void setModified_on(Date modified_on) {
        this.modified_on = modified_on;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", MasterSetting.class.getSimpleName() + "[", "]")
                .add("s_id=" + s_id)
                .add("logo=" + Arrays.toString(logo))
                .add("back_image=" + Arrays.toString(back_image))
                .add("user_location='" + user_location + "'")
                .add("user_latitude='" + user_latitude + "'")
                .add("user_longitude='" + user_longitude + "'")
                .add("show_out_stock=" + show_out_stock)
                .add("show_tax_split=" + show_tax_split)
                .add("item_grouping=" + item_grouping)
                .add("item_grouping_attr='" + item_grouping_attr + "'")
                .add("facebook_url='" + facebook_url + "'")
                .add("instagram_url='" + instagram_url + "'")
                .add("twitter_url='" + twitter_url + "'")
                .add("enable_cancellation=" + enable_cancellation)
                .add("enable_customer_cancellation=" + enable_customer_cancellation)
                .add("max_time=" + max_time)
                .add("applicable_order_status_cust='" + applicable_order_status_cust + "'")
                .add("enable_del_partner_can=" + enable_del_partner_can)
                .add("max_bandwidth_time=" + max_bandwidth_time)
                .add("applicable_order_status_deli='" + applicable_order_status_deli + "'")
                .add("created_on=" + created_on)
                .add("modified_on=" + modified_on)
                .toString();
    }
}
