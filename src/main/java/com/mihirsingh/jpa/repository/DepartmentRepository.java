package com.mihirsingh.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mihirsingh.jpa.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
