package com.icbt.appoiment.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private Long id;
    private String name;
    private String mobile;
    private String email;
    private String nic;
    private String role;
    private String username;

    // Constructor, getter, and setter methods

    public UserDTO(Long id, String name, String mobile, String email, String nic, String role, String username) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.nic = nic;
        this.role = role;
        this.username = username;
    }

    // Getter and setter methods for other fields

    // Default constructor
    public UserDTO() {
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

    // Getter and setter methods for other fields

    // Additional methods as needed
    
}
