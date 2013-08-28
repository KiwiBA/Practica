package com.barbeit.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.barbeit.domain.Practical;

public class PracticalDAOImpl implements PracticalDAO{

	private HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) 
    {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public void savePractical(Practical practical) {
		hibernateTemplate.saveOrUpdate(practical);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Practical> listPractical() {
		return hibernateTemplate.find("from Practical");
	}
}
