package com.mihirsingh.jpa.services.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mihirsingh.jpa.entities.User;
import com.mihirsingh.jpa.repository.UserRepository;
import com.mihirsingh.jpa.services.UserService;

@Service
public class USerSeviceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    Logger logger = LoggerFactory.getLogger(USerSeviceImpl.class);

    @Override
    public User savUser(User user) {
        // TODO Auto-generated method stub
        User saveuser = userRepository.save(user);
        logger.info("saveuser ::: " + saveuser.getId());
        return saveuser;
    }

    @Override
    public User updateUser(User user, int userId) {
        // TODO Auto-generated method stub
        User oldUser = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User with given id is not found"));
        oldUser.setName(user.getName());
        oldUser.setCity(user.getCity());
        oldUser.setAge(user.getAge());

        User usernew = userRepository.save(oldUser);
        return usernew;
    }

    @Override
    public List<User> getAllUser() {
        // TODO Auto-generated method stub
        List<User> userList = userRepository.findAll();
        return userList;
    }

    @Override
    public User getSingleUser(int userId) {
        // TODO Auto-generated method stub
        Optional<User> userOptional = userRepository.findById(userId);
        User user = userOptional.orElseThrow(() -> new RuntimeException("User with given id is not found"));
        return user;
    }

    @Override
    public void deleteUser(int userId) {
        // TODO Auto-generated method stub

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User with given id is not found"));

        userRepository.delete(user);

        logger.info("user deleted");
    }

}
