package com.lashko.blackjack.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lashko.blackjack.entity.Account;
import com.lashko.blackjack.service.AccountService;


//@RestController
@Controller
@RequestMapping("/account")
public class AccountController {

//	private final AccountService accountService;
	@Autowired
	AccountService accountService;

	public AccountController(final AccountService accountService) {
		this.accountService = accountService;
	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public Account createAccount(@RequestBody @Valid final Account account) {
		return accountService.create(account);
	}
	
	
}

