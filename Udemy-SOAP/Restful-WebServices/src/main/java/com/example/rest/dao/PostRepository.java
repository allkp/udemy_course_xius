package com.example.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rest.user.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{

}
