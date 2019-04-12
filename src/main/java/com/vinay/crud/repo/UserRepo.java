package com.vinay.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.vinay.crud.model.User;

@Component
@CrossOrigin
public interface UserRepo extends JpaRepository<User, Integer> {

}
