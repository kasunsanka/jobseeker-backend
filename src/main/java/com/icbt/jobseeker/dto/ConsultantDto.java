package com.icbt.jobseeker.dto;

public class ConsultantDto {
    private Long id;
    private String email;
    private String mobile;
    private String name;
    private String nic;
    private String role;
    private String username;

    // Constructors
    public ConsultantDto() {
        // Default constructor
    }

    public ConsultantDto(Long id, String email, String mobile, String name, String nic, String role, String username) {
        this.id = id;
        this.email = email;
        this.mobile = mobile;
        this.name = name;
        this.nic = nic;
        this.role = role;
        this.username = username;
    }

    // Getters and setters
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

    @Override
    public String toString() {
        return "ConsultantDto{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", name='" + name + '\'' +
                ", nic='" + nic + '\'' +
                ", role='" + role + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
