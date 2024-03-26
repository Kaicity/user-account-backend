package com.example.useraccount.repository;

import com.example.useraccount.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, String> {
    @Query("SELECT a FROM Account a WHERE a.username = :username AND a.password = :password")
    Optional<Account> findOneByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
