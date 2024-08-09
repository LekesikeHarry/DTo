package com.dtoexample.dtodemo.repository;

import com.dtoexample.dtodemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
