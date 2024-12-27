package com.example.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rest.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
