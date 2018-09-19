package com.hansa.morasquad.controllers;

import com.hansa.morasquad.domain.UserDTO;
import com.hansa.morasquad.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//user REST controller
@RestController
@RequestMapping("/user")
public class User {

    @Autowired //UserService is a dependency to UserDTO class
    private UserServices userServices;

    @GetMapping("/all")
    public List<UserDTO> allUsers(){
        return userServices.findAllUsers();
        //return "All users";
    }

    @PostMapping("/add")
    public String addUser(@RequestBody UserDTO Userdata){
        return userServices.saveUser(Userdata);
    }

    @PutMapping("/update")
    public String updateUser(@RequestBody UserDTO newUserData){
        return userServices.updateUser(newUserData);
    }

    @GetMapping("/find/{id}")
    public UserDTO getUserById(@PathVariable Integer id){
        return userServices.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUserById(@PathVariable Integer id){
        return userServices.deleteById(id);
    }

}
