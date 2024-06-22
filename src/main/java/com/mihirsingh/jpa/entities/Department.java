package com.mihirsingh.jpa.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @Column(name = "id")
    private int department_id;

    @Column(name = "name")
    private String department_name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Employee> employee;

    public Department() {
    }

    public Department(int department_id, String department_name, List<Employee> employee) {
        this.department_id = department_id;
        this.department_name = department_name;
        this.employee = employee;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public List<Employee> getEmployee(List<Employee> emp1) {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Department [department_id=" + department_id + ", department_name=" + department_name + ", employee="
                + employee + "]";
    }

}
