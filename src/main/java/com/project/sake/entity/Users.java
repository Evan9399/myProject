package com.project.sake.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Users {
    /**
     * 使用者ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * 使用者帳號
     */
    @Column(name = "username", unique = true, nullable = false)
    private String username;

    /**
     * 使用者密碼
     */
    @Column(name = "password", unique = true, nullable = false)
    private String password;

    /**
     * 使用者信箱
     */
    @Column(name = "email", unique = true, nullable = false)
    private String email;

}