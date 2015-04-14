package com.lashko.blackjack.controller;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lashko.blackjack.entity.Account;
import com.lashko.blackjack.service.AccountService;

@RestController
public class AccountController {

	private final AccountService accountService;

	@Inject
	public AccountController(final AccountService accountService) {
		this.accountService = accountService;
	}

	@RequestMapping(value = "/account/{ammount}", method = RequestMethod.POST)
	public Account createAccount(@PathVariable double ammount) {
		return accountService.save(ammount);
	}

}
