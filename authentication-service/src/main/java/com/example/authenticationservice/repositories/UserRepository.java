package com.example.authenticationservice.repositories;

import com.example.authenticationservice.entities.User;
import com.example.commonsmodule.DTOs.UserDTO;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    @EntityGraph(attributePaths = {"roles"})
    Optional<User> findByUsername(String username);

    User findUserById(Long userId);
}
