package com.icbt.jobseeker.dto;

public class JobseekerDto {
    private Long id;
    private String email;
    private String mobile;
    private String name;
    private String nic;
    private String role;
    private String username;
    private String date;
    private String time;
    private Long consultantId;
    private String status;

    public JobseekerDto() {
        // Default constructor
    }

    public JobseekerDto(Long id, String email, String mobile, String name, String nic, String role, String username,
                        String date, String time, Long consultantId, String status) {
        this.id = id;
        this.email = email;
        this.mobile = mobile;
        this.name = name;
        this.nic = nic;
        this.role = role;
        this.username = username;
        this.date = date;
        this.time = time;
        this.consultantId = consultantId;
        this.status = status;
    }

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

