package com.mihirsingh.jpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "laptop")
public class Laptop {

    @Id
    @Column(name = "laptop_id")
    private int laptop_id;
    private String modelNumber;
    private String brand;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public Laptop(Student student) {
        this.student = student;
    }

    public Laptop() {
    }

    public Laptop(int laptop_id, String modelNumber, String brand) {
        this.laptop_id = laptop_id;
        this.modelNumber = modelNumber;
        this.brand = brand;
    }

    public int getLaptop_id() {
        return laptop_id;
    }

    public void setLaptop_id(int laptop_id) {
        this.laptop_id = laptop_id;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
