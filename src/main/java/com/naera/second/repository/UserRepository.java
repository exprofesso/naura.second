package com.naera.second.repository;

import com.naera.second.model.Role;
import com.naera.second.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
interface UserRepository<U> extends JpaRepository<User, Integer> {
    List<User> findByEmail(String email);
}