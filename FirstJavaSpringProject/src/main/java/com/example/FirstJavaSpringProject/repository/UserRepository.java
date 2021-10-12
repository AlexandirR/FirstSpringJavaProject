package com.example.FirstJavaSpringProject.repository;

import com.example.FirstJavaSpringProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
