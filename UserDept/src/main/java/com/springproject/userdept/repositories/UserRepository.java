package com.springproject.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
