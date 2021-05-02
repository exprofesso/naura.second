package com.naera.second.repository;

import com.naera.second.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
interface RoleRepository<U> extends JpaRepository<Role, Integer> {
    List<Role> findByRole(String role);
}
