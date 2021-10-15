package com.pos.model;

import javax.persistence.*;
import java.util.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "auto_gen")
    @SequenceGenerator(name = "auto_gen", sequenceName = "emp_id_seq",allocationSize = 1)
    Integer employee_id;
    String name;
    String type;
    String password;
    String passcode;
    String username;
    String email;
    long phone;
    String roles;
    String locations;
    Boolean is_active;
    Date created_on;
    Date modified_on;

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public Boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
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
        return new StringJoiner(", ", Employee.class.getSimpleName() + "[", "]")
                .add("employee_id=" + employee_id)
                .add("name='" + name + "'")
                .add("type='" + type + "'")
                .add("password='" + password + "'")
                .add("passcode='" + passcode + "'")
                .add("username='" + username + "'")
                .add("email='" + email + "'")
                .add("phone=" + phone)
                .add("roles='" + roles + "'")
                .add("locations='" + locations + "'")
                .add("is_active=" + is_active)
                .add("created_on=" + created_on)
                .add("modified_on=" + modified_on)
                .toString();
    }
}

