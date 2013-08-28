package com.barbeit.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.barbeit.domain.Effort;

public class EffortDAOImpl implements EffortDAO{

	private HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) 
    {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public void saveEffort(Effort effort) {
		hibernateTemplate.saveOrUpdate(effort);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Effort> listEffort() {
		return hibernateTemplate.find("from Effort");
	}
}
