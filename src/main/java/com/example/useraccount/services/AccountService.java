package com.example.useraccount.services;

import com.example.useraccount.model.Account;
import com.example.useraccount.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    @Transactional
    public Optional<Account> getUserAccount(String username, String password){
        try{
            int a = 0;
            return accountRepository.findOneByUsernameAndPassword(username, password);
        }
        catch (Exception ex){
          throw ex;
        }
    }
}
