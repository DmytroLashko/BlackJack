package com.lashko.blackjack.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lashko.blackjack.entity.Account;

public interface AccountRepository extends JpaRepository<Account , Long> {

}
