package com.doctor.appoinment.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "appointments")
public class Appointments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "department", nullable = false)
    private String department;
    @Column(name = "doctor", nullable = false)
    private String doctor;
    @Column(name = "date", nullable = false)
    private String date;
    @Column(name = "time", nullable = false)
    private String time;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "message", nullable = true)
    private String message;

    public Appointments() {
        // Default constructor
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Appointments(int id, String department, String doctor, String date, String time, String name, String phone,
            String message) {
        this.id = id;
        this.department = department;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
        this.name = name;
        this.phone = phone;
        this.message = message;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Appointment{");
        sb.append("id=").append(id);
        sb.append(", department=").append(department);
        sb.append(", doctor=").append(doctor);
        sb.append(", date=").append(date);
        sb.append(", time=").append(time);
        sb.append(", name=").append(name);
        sb.append(", phone=").append(phone);
        sb.append(", message=").append(message);
        sb.append('}');
        return sb.toString();
    }
}
