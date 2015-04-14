package com.lashko.blackjack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="accountId", nullable = false, updatable = false )
	private Long id;

	@Column(name="ammount")
	private Double ammount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getAmmount() {
		return ammount;
	}

	public void setAmmount(Double ammount) {
		this.ammount = ammount;
	}


}
