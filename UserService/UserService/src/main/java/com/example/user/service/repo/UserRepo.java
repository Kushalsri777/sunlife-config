package com.example.user.service.repo;

import com.example.user.service.entities.User;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, String>  //takes 1st param. entity on which we want to use operations and 2nd param. type of primary key(Id) in entity
{
    //we can implement any custom query here
}
