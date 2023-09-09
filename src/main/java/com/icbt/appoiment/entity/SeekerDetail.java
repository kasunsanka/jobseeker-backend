package com.icbt.appoiment.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "seeker_detail")
public class SeekerDetail{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "nic")
    private String nic;

    @Column(name = "address")
    private String address;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "email")
    private String email;

    @Column(name = "occupation")
    private String occupation;

    @Column(name = "exceptedcountry")
    private String exceptedcountry;

    @Column(name = "exceptedjob")
    private String exceptedjob;

    @Column(name = "exceptedsalary")
    private double exceptedsalary;

    @Column(name = "remark")
    private String remark;

    @Column(name = "date") // Change data type to String
    private String date;

    @Column(name = "time") // Change data type to String
    private String time;

    @Column(name = "status")
    private String status;

    @Column(name = "file")
    
    @Type(type = "org.hibernate.type.BinaryType")  // Assuming you're using SQL Server, adjust for your database
    private byte[] file;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "seekerDetail")
    private List<Appointment> appointments;

	public SeekerDetail(Long id, String firstname, String nic, String address, String mobile, String email,
			String occupation, String exceptedcountry, String exceptedjob, double exceptedsalary, String remark,
			String date, String time, String status, byte[] file, List<Appointment> appointments) {
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
		this.file = file;
		this.appointments = appointments;
	}

	public SeekerDetail() {
	}

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

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}
    
    


}