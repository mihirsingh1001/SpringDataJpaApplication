package com.mihirsingh.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mihirsingh.jpa.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
