package com.huynm.bookstore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.huynm.bookstore.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

   Optional<User> findByUsername(String username);
   Optional<User> findByUsernameOrEmail(String username, String email);	
   Optional<User> findByEmail(String email);
   Boolean existsByUsername(String username);
   Boolean existsByEmail(String email);

}
