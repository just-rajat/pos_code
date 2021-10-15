package com.pos.model;
import javax.persistence.*;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "store_cms")
public class StoreCms {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "auto_gen")
    @SequenceGenerator(name = "auto_gen", sequenceName = "store_cms_id_seq",allocationSize = 1)
    Integer cms_id;
    String name;
    String type;
    String created_on;
    String modified_on;
    String content;
    Boolean is_active;
    String p_id;
    Integer app_id;

    public Integer getCms_id() {
        return cms_id;
    }

    public void setCms_id(Integer cms_id) {
        this.cms_id = cms_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public Integer getApp_id() {
        return app_id;
    }

    public void setApp_id(Integer app_id) {
        this.app_id = app_id;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", StoreCms.class.getSimpleName() + "[", "]")
                .add("cms_id=" + cms_id)
                .add("name='" + name + "'")
                .add("type='" + type + "'")
                .add("created_on='" + created_on + "'")
                .add("modified_on='" + modified_on + "'")
                .add("content='" + content + "'")
                .add("is_active=" + is_active)
                .add("p_id='" + p_id + "'")
                .add("app_id=" + app_id)
                .toString();
    }
}
