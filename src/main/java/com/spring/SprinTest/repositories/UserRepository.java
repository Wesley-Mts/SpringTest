package com.spring.SprinTest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.SprinTest.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long >{

}