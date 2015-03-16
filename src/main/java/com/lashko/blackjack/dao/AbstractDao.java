package com.lashko.blackjack.dao;

public interface AbstractDao<E> {
	void create(E e);
    E find(Integer id);
    void update(E e);
    void delete(E e);
    
    void save(E e);
    
}
