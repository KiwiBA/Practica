package com.barbeit.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.barbeit.domain.Advisor;

public class AdvisorDAOImpl implements AdvisorDAO{

	private HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) 
    {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public void saveAdvisor(Advisor advisor) {
		hibernateTemplate.saveOrUpdate(advisor);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Advisor> listAdvisor() {
		return hibernateTemplate.find("from Advisor");
	}
}
