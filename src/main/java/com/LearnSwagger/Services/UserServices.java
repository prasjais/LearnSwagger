package com.LearnSwagger.Services;

import com.LearnSwagger.model.User;

import java.util.List;

public interface UserServices {

    public User addUser(User user);

    public User update(int id, User user);

    public List<User> getAllUser();

    public User getUser(int id);

    public void deleteUser(int id);

}
