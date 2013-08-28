package com.barbeit.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import java.lang.reflect.ParameterizedType;

public class GenericDAOImpl<T> extends HibernateDaoSupport implements GenericDAO<T>{

	@PersistenceContext
	protected EntityManager em;
	
	private Class<T> entityClass;
	
	@Autowired
	public void setSession(SessionFactory sessionFactory){
		this.setSessionFactory(sessionFactory);
	}
	
	public GenericDAOImpl(){
		entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	@Override
	public T create(T id) {
		this.em.persist(id);
		return id;
	}

	@Override
	public List<T> loadAll() {
		return em.createQuery("FROM" + getClass().getGenericSuperclass()).getResultList();
		
	}

	@Override
	public T update(T id) {
		return this.em.merge(id);
	}

	@Override
	public void delete(T id) {
		this.em.remove(this.em.getReference(entityClass, id));
		
	}

	@Override
	public T find(T id) {
		return (T) this.em.find(entityClass, id);
	}

	@Override
	public List<T> getListByCriteria(DetachedCriteria detachedcriteria) {
		return getHibernateTemplate().findByCriteria(detachedcriteria);
	}

	@Override
	public List<T> getListByCriteria(DetachedCriteria detachedcriteria,
			int offset, int size) {
		return getHibernateTemplate().findByCriteria(detachedcriteria, offset, size);
	}

}
