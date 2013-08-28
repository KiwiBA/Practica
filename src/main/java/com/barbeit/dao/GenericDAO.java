package com.barbeit.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface GenericDAO<T> {

	public T create(T id);
	public List<T> loadAll();
	public T update(T id);
	public void delete(T id);
	public T find(T id);
	
	public List<T> getListByCriteria(DetachedCriteria detachedcriteria);
	public List<T> getListByCriteria(DetachedCriteria detachedcriteria, int offset, int size);
	
}
