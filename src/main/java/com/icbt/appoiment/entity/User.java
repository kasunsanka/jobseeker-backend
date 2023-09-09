package com.icbt.appoiment.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



	@Entity
	@Table(name = "user")
	public class User{
		    @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    private Long id;

		    @Column(name = "name")
		    private String name;

		    @Column(name = "mobile")
		    private String mobile;

		    @Column(name = "email")
		    private String email;

		    @Column(name = "nic")
		    private String nic;

		    @Column(name = "role")
		    private String role;

		    @Column(name = "username")
		    private String username;

		    @Column(name = "password")
		    private String password;

		    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
		    private List<Appointment> appointments;

		    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
		    private List<Availability> availability;

			public User(Long id, String name, String mobile, String email, String nic, String role, String username,
					String password, List<Appointment> appointments, List<Availability> availability) {
				super();
				this.id = id;
				this.name = name;
				this.mobile = mobile;
				this.email = email;
				this.nic = nic;
				this.role = role;
				this.username = username;
				this.password = password;
				this.appointments = appointments;
				this.availability = availability;
			}

			public User() {
				
			}

			public Long getId() {
				return id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
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

			public String getNic() {
				return nic;
			}

			public void setNic(String nic) {
				this.nic = nic;
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

			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public List<Appointment> getAppointments() {
				return appointments;
			}

			public void setAppointments(List<Appointment> appointments) {
				this.appointments = appointments;
			}

			public List<Availability> getAvailability() {
				return availability;
			}

			public void setAvailability(List<Availability> availability) {
				this.availability = availability;
			}
		    
		    
	
	}
