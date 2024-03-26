package com.example.useraccount.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "account")
public class Account {
    @Id
    private String id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;
}
