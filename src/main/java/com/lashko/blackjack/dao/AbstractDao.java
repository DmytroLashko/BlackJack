package com.lashko.blackjack.dao;

import java.util.Set;

import org.hibernate.criterion.Criterion;
import org.springframework.stereotype.Repository;
@Repository
public interface AbstractDao<E> {
	E create(E e);
    E find(Long id);
    void update(E e);
    void delete(E e);
    Set<E> where(Criterion criterion);
    
    void save(E e);
    
}
