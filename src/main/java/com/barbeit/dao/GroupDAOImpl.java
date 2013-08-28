package com.barbeit.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.barbeit.domain.Group;

public class GroupDAOImpl implements GroupDAO{

	private HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) 
    {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public void saveGroup(Group group) {
		hibernateTemplate.saveOrUpdate(group);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Group> listGroup() {
	return hibernateTemplate.find("from Group");
	}
}
