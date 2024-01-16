package com.user.AccountService.dao.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
@NoArgsConstructor
@ToString
@Data
@Entity
@Table(name = "LGL_USER")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LGL_USER_ID", nullable = false)
    private Long id;

    @Column(name = "LGL_USER_FIRST_NAME", nullable = false)
    private String firstname;

    @Column(name = "LGL_USER_LAST_NAME", nullable = false)
    private String lastname;

    @Column(name = "LGL_USER_EMAIL", nullable = false)
    private String email;

    @Column(name = "LGL_USER_PASSWORD", nullable = false)
    private String password;

    @Column(name = "LGL_USER_PHONE", nullable = false)
    private String phone;

    @Column(name = "LGL_USER_TYPE", nullable = false)
    private String type;

    @Column(name = "LGL_USER_JOB", nullable = true)
    private String job;

    public User(String firstname, String lastname, String email
            , String password, String phone, String type,String job) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.type = type;
        this.job=job;
    }
}
