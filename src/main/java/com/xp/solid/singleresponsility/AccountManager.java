package com.xp.solid.singleresponsility;

import java.util.HashMap;

//1. Use Control top demo JSON and XML is we follow the Single Responsibility
//Requirement: I want account to be returned as JSON
public class AccountManager {
    HashMap<Long, Account> repo=new HashMap<>();

    public AccountManager() {
        //init with an account
        Account a = new Account();
        a.setId(1);
        a.setBalance(1000);
        repo.put(a.getId(), a);
    }

    public Account getAccount(long id) {
        Account result = repo.get(id);

        return result;
    }
}
