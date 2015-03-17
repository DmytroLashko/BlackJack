package com.lashko.blackjack.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lashko.blackjack.dao.AccountDao;
import com.lashko.blackjack.entity.Account;
import com.lashko.blackjack.service.AccountService;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;

	// @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	@Override
	public Account create(Account account) {
		return accountDao.create(account);
	}

	@Override
	public Account getById(Long id) {

		return accountDao.find(id);
	}

	@Override
	public Set<Account> getAll() {

		return accountDao.where(null);
	}

	@Override
	public void updateAccount(Account account) {
		accountDao.update(account);

	}

}
