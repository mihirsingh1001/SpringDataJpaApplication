package com.mihirsingh.jpa.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "student_id")
    private int student_id;
    @Column(name = "student_name")
    private String student_name;

    // @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    // private Laptop laptop;

    @ManyToMany
    // @JoinColumn(name = "course_id")
    private List<Course> course;

    public Student(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
    }

    public Student(List<Course> course) {
        this.course = course;
    }

    // public Laptop getLaptop() {
    //     return laptop;
    // }

    // public void setLaptop(Laptop laptop) {
    //     this.laptop = laptop;
    // }

    // public Student(Laptop laptop) {
    //     this.laptop = laptop;
    // }

    public Student() {
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [student_id=" + student_id + ", student_name=" + student_name 
                + ", course=" + course + "]";
    }

}
