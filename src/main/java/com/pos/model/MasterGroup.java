package com.pos.model;

import javax.persistence.*;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "master_group")
public class MasterGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "auto_gen")
    @SequenceGenerator(name = "auto_gen", sequenceName = "group_id_seq",allocationSize = 1)

    Integer group_id;
    String group_name;
    Date created_on;
    Date modified_on;

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
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
        return new StringJoiner(", ", MasterGroup.class.getSimpleName() + "[", "]")
                .add("group_id=" + group_id)
                .add("group_name='" + group_name + "'")
                .add("created_on=" + created_on)
                .add("modified_on=" + modified_on)
                .toString();
    }
}
