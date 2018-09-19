package com.hansa.morasquad.services;

import com.hansa.morasquad.domain.UserDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserServices {
    List<UserDTO> findAllUsers(); // cant implement methods in interfaces only can define

    String saveUser(UserDTO userdata);

    String updateUser(UserDTO newUserData);

    UserDTO findById(Integer id);

    String deleteById(Integer id);
}
