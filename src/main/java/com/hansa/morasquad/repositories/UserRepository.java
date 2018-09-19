package com.hansa.morasquad.repositories;

import com.hansa.morasquad.domain.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

//Manages User Services Related the Database
public interface UserRepository extends JpaRepository<UserDTO,Integer> {  //data layer

    //getAllUsers
    //FindByID,Delete,update,CustomQueary


}
