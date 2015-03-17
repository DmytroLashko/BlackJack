package com.lashko.blackjack.service;

import java.util.Set;

import com.lashko.blackjack.entity.Account;

public interface AccountService {

	Account create(Account account);

	Account getById(Long id);

	Set<Account> getAll();

	void updateAccount(Account account);

}
