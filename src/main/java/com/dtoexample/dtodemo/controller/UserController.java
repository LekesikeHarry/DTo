package com.dtoexample.dtodemo.controller;

import com.dtoexample.dtodemo.dto.UserLocationDTO;
import com.dtoexample.dtodemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users-location")
    public List<UserLocationDTO> getUsers() {
        return userService.getAllUsersLocation();
    }
}
