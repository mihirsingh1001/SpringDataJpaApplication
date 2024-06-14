package com.mihirsingh.jpa.services;

import java.util.List;

import com.mihirsingh.jpa.entities.User;

public interface UserService {

    User savUser(User user);

    User updateUser(User user, int userId);

    List<User> getAllUser();

    User getSingleUser(int userId);

    void deleteUser(int userId);

}
