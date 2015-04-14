package com.lashko.blackjack.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lashko.blackjack.dao.AccountRepository;
import com.lashko.blackjack.entity.Account;
import com.lashko.blackjack.service.AccountService;
@Service("accountService")
public class AccountServiceImpl implements AccountService {

	 private final AccountRepository repository;

	    @Inject
	    public AccountServiceImpl(final AccountRepository repository) {
	        this.repository = repository;
	    }

	    @Override
	    @Transactional
	    public Account save(double ammount) {
	    	Account account = new Account();
	    	account.setAmmount(ammount);
	    	repository.save(account);
	        return repository.save(account);
	    }

//	@Autowired
//	private AccountDao accountDao;
//
//	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
//	@Override
//	public Account create(Account account) {
//		return accountDao.create(account);
//	}
//
//	@Override
//	public Account getById(Long id) {
//
//		return accountDao.find(id);
//	}
//
//	@Override
//	public Set<Account> getAll() {
//
//		return accountDao.where(null);
//	}
//
//	@Override
//	public void updateAccount(Account account) {
//		accountDao.update(account);
//
//	}

}
