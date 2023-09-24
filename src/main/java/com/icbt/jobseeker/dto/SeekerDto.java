package com.icbt.jobseeker.dto;
public class SeekerDto {
    private Long id;
    private String firstname;
    private String nic;
    private String address;
    private String mobile;
    private String email;
    private String occupation;
    private String exceptedcountry;
    private String exceptedjob;
    private double exceptedsalary;
    private String remark;
    private String date;
    private String time;
    private String status;

    // Constructors

    // Default constructor
   
    // Constructor with parameters
    public SeekerDto(Long id, String firstname, String nic, String address, String mobile, String email, String occupation, String exceptedcountry, String exceptedjob, double exceptedsalary, String remark, String date, String time, String status) {
        this.id = id;
        this.firstname = firstname;
        this.nic = nic;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
        this.occupation = occupation;
        this.exceptedcountry = exceptedcountry;
        this.exceptedjob = exceptedjob;
        this.exceptedsalary = exceptedsalary;
        this.remark = remark;
        this.date = date;
        this.time = time;
        this.status = status;
    }
 public SeekerDto() {
    }

    // Getters and setters for all fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getExceptedcountry() {
        return exceptedcountry;
    }

    public void setExceptedcountry(String exceptedcountry) {
        this.exceptedcountry = exceptedcountry;
    }

    public String getExceptedjob() {
        return exceptedjob;
    }

    public void setExceptedjob(String exceptedjob) {
        this.exceptedjob = exceptedjob;
    }

    public double getExceptedsalary() {
        return exceptedsalary;
    }

    public void setExceptedsalary(double exceptedsalary) {
        this.exceptedsalary = exceptedsalary;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
