package com.icbt.jobseeker.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jobseeker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String mobile;
    private String name;
    private String nic;
    private String password;
    private String role;
    private String username;
    private String date;
    private String time;
    private Long consultantId;
    private String status;

    // Constructors
    public Jobseeker() {
        // Default constructor
    }

    public Jobseeker(Long id, String email, String mobile, String name, String nic, String password, String role,
                     String username, String date, String time, Long consultantId, String status) {
        this.id = id;
        this.email = email;
        this.mobile = mobile;
        this.name = name;
        this.nic = nic;
        this.password = password;
        this.role = role;
        this.username = username;
        this.date = date;
        this.time = time;
        this.consultantId = consultantId;
        this.status = status;
    }

    // Getters and setters for all fields
    // You can generate these using your IDE or write them manually.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Long getConsultantId() {
        return consultantId;
    }

    public void setConsultantId(Long consultantId) {
        this.consultantId = consultantId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
