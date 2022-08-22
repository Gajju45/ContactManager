package com.contact.manager.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contact.manager.dto.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
