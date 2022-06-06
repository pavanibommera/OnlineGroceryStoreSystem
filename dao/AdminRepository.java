package com.spring.restapi.grocerystore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.restapi.grocerystore.model.Admin;
import com.spring.restapi.grocerystore.model.User;

import java.util.List;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{

    List<Admin> findAll();

    User findByEmail(String email);

    User findUserByEmail(String email);
}
