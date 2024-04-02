package com.example.application.data;

import java.sql.Time;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Contact extends AbstractEntity {

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @Email
    @NotEmpty
    private String email;

    @ManyToOne
    private Company company;

    private LocalTime wakeupTime;

    private LocalTime sleepyTime;

    public Contact() {
    }

    public Contact(String firstName, String lastName, String email, Company company, LocalTime wakeupTime, LocalTime sleepyTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.company = company;
        this.wakeupTime = wakeupTime;
        this.sleepyTime = sleepyTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public LocalTime getWakeupTime() {
        return wakeupTime;
    }

    public void setWakeupTime(LocalTime wakeupTime) {
        this.wakeupTime = wakeupTime;
    }

    public LocalTime getSleepyTime() {
        return sleepyTime;
    }

    public void setSleepyTime(LocalTime sleepyTime) {
        this.sleepyTime = sleepyTime;
    }

}
