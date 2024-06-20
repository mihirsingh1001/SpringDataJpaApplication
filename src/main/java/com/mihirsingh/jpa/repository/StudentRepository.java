package com.mihirsingh.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mihirsingh.jpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
