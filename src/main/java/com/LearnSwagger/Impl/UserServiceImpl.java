package com.LearnSwagger.Impl;

import com.LearnSwagger.Exception.ResourceNotFoundException;
import com.LearnSwagger.Repo.UserRepo;
import com.LearnSwagger.Services.UserServices;
import com.LearnSwagger.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User addUser(User user) {
        return this.userRepo.save(user);
    }

    @Override
    public User update(int id, User user) {
        User user1 = this.userRepo.findById(id).orElseThrow(()->new ResourceNotFoundException(id));
        user1.setId(user.getId());
        user1.setName(user.getName());
        user1.setSalary(user.getSalary());
        return this.userRepo.save(user1);
    }

    @Override
    public List<User> getAllUser() {
        return this.userRepo.findAll();
    }

    @Override
    public User getUser(int id) {
        User user = this.userRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException(id));
        return user;
    }

    @Override
    public void deleteUser(int id) {

        User user = this.userRepo.findById(id).orElseThrow(()->new ResourceNotFoundException(id));
        this.userRepo.delete(user);
    }
}
