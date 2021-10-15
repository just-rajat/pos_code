package com.pos.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "store_banner")
public class StoreBanner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "auto_gen")
    @SequenceGenerator(name = "auto_gen", sequenceName = "banner_id_seq",allocationSize = 1)
    Integer banner_id;
    String name;
    Integer position;
    byte[] banner_image;
    String client;
    String entity_type;
    String created_on;
    String modified_on;
    Boolean is_active;

    public Integer getBanner_id() {
        return banner_id;
    }

    public void setBanner_id(Integer banner_id) {
        this.banner_id = banner_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public byte[] getBanner_image() {
        return banner_image;
    }

    public void setBanner_image(byte[] banner_image) {
        this.banner_image = banner_image;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getEntity_type() {
        return entity_type;
    }

    public void setEntity_type(String entity_type) {
        this.entity_type = entity_type;
    }

    public String getCreated_on() {
        return created_on;
    }

    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }

    public String getModified_on() {
        return modified_on;
    }

    public void setModified_on(String modified_on) {
        this.modified_on = modified_on;
    }

    public Boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", StoreBanner.class.getSimpleName() + "[", "]")
                .add("banner_id=" + banner_id)
                .add("name='" + name + "'")
                .add("position=" + position)
                .add("banner_image=" + Arrays.toString(banner_image))
                .add("client='" + client + "'")
                .add("entity_type='" + entity_type + "'")
                .add("created_on='" + created_on + "'")
                .add("modified_on='" + modified_on + "'")
                .add("is_active=" + is_active)
                .toString();
    }
}
