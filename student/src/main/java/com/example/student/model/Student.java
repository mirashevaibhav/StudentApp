package com.example.student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer rollNumber;
    private String name;
    private String address;
    private Double percentage;
    public Integer getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Double getPercentage() {
        return percentage;
    }
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }


}
