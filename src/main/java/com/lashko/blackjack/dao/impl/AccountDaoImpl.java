package com.lashko.blackjack.dao.impl;

import org.springframework.stereotype.Repository;

import com.lashko.blackjack.dao.AccountDao;
import com.lashko.blackjack.entity.Account;

@Repository("accountRepository")
public class AccountDaoImpl extends AbstractDaoImpl<Account> implements AccountDao {

}
