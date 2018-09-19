package com.hansa.morasquad.services.impl;

import com.hansa.morasquad.domain.UserDTO;
import com.hansa.morasquad.repositories.UserRepository;
import com.hansa.morasquad.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> findAllUsers() {
        //search from database and return all users
        //return "userservice impl return this string";
        List<UserDTO> allusers= userRepository.findAll();
        return allusers;
    }

    @Override
    public String saveUser(UserDTO userdata) {
        userRepository.save(userdata);
        return "Data saved";

    }

    @Override
    public String updateUser(UserDTO newUserData) {
            String msg = null;
        if (newUserData.getId()!=null){
            userRepository.save(newUserData);
            msg="Data Updated";
        }else {
            msg="Something went wrong";
        }
        return msg;


    }

    @Override
    public UserDTO findById(Integer id) {
        return  userRepository.findOne(id);
    }

    @Override
    public String deleteById(Integer id) {
         userRepository.delete(findById(id));
         return "Deleted Successfully";
    }
}
