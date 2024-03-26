package com.example.useraccount.controller;

import com.example.useraccount.model.Account;
import com.example.useraccount.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping("login")
    public ResponseEntity<?> Login(@RequestBody Account account) {
        int a = 0;

        String username = account.getUsername();
        String password = account.getPassword();

        Optional<Account> accountLogin = accountService.getUserAccount(username, password);
        if (accountLogin.isPresent()) {
            return ResponseEntity.ok(account);
        } else return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
    }
}
