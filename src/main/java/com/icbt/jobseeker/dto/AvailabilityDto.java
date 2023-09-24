package com.icbt.jobseeker.dto;

public class AvailabilityDto {
    private Long id;
    private String date;
    private String time;
    private String type;
    private Long consultantId;  // New field for consultant_id
    private ConsultantDto consultant;

    // Constructors
    public AvailabilityDto() {
        // Default constructor
    }

    public AvailabilityDto(Long id, String date, String time, String type, Long consultantId) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.type = type;
        this.consultantId = consultantId;  // Initialize consultant_id
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getConsultantId() {
        return consultantId;
    }

    public void setConsultantId(Long consultantId) {
        this.consultantId = consultantId;
    }
    public ConsultantDto getConsultant() {
        return consultant;
    }

    public void setConsultant(ConsultantDto consultant) {
        this.consultant = consultant;
    }

    @Override
    public String toString() {
        return "AvailabilityDto{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", type='" + type + '\'' +
                ", consultantId=" + consultantId +
                '}';
    }
}
