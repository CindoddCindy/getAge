package com.getage.getageautmaticaly.controller;

import com.getage.getageautmaticaly.model.User;
import com.getage.getageautmaticaly.repository.UserRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Period;

@RestController
public class UserController {


    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/userInput")
    public void postSUser(@RequestBody User user) {

        User mUser = new User();
        mUser.setName(user.getName());
        mUser.setBirthDate(user.getBirthDate());
        userRepository.save(mUser);

    }

    @PostMapping("/adminInput")
    public void postCurrentDate(@RequestBody User user) {

        User mUser = new User();
        mUser.setName(user.getName());
        mUser.setCurrentDate(user.getCurrentDate());
        userRepository.save(mUser);

    }

    @GetMapping("/users/age")
    public Integer getUser(@Param("birthDate") LocalDate birthDate, @Param("currentDate") LocalDate currentDate) {
        return Period.between(birthDate, currentDate).getYears();

}}
