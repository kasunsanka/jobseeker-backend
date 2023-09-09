package com.icbt.appoiment.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "availability")
public class Availability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "date")
    private String date;
    @Column(name = "time")
    private String time;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id") // Specify the foreign key column name
    private User user;

    // Constructors
    public Availability() {
    }

    public Availability(String date, String time, User user) {
        this.date = date;
        this.time = time;
        this.user = user;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
