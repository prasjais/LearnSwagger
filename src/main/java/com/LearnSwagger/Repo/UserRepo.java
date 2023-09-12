package com.LearnSwagger.Repo;

import com.LearnSwagger.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
