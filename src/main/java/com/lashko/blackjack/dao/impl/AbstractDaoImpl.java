package com.lashko.blackjack.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.LinkedHashSet;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;

import com.lashko.blackjack.dao.AbstractDao;

public abstract class AbstractDaoImpl<E> implements AbstractDao<E> {

	private Class<? extends E> domainClass;

	//@Autowired
	private SessionFactory sessionFactory;

	public AbstractDaoImpl() {
		domainClass = (Class<E>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public Session getCurrentSession() {
		Session s;
		try {
			s = sessionFactory.getCurrentSession();
		} catch (Exception e) {
			s = sessionFactory.openSession();
		}

		return s;
	}

	@Override
	public E create(E e) {
	return	(E) getCurrentSession().save(e);
	}

	@Override
	public E find(Long id) {
		return (E) getCurrentSession().get(domainClass, id);
	}

	@Override
	public void update(E e) {
		getCurrentSession().update(e);

	}

	@Override
	public void delete(E e) {
		getCurrentSession().delete(e);

	}

	@Override
	public void save(E e) {
		getCurrentSession().saveOrUpdate(e);

	}
    @Override
    public Set<E> where(Criterion criterion) {
        Criteria criteria = getCurrentSession().createCriteria(domainClass);
        if (criterion != null) {
        	criteria.add(criterion);
        }
        Set<E> set = new LinkedHashSet(criteria.list());
         return  set;
//        return (Set<E>) criteria.list();
        
    }

}
