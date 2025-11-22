package com.project.sake.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.sake.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
