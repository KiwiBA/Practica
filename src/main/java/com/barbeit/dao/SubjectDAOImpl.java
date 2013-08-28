package com.barbeit.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.barbeit.domain.Subject;

@Repository
public class SubjectDAOImpl implements SubjectDAO{
	
	@PersistenceContext
	protected EntityManager em;
	
	public EntityManager getEntityManager(){
		return em;
	}
	
	
	public void setEntityManager(EntityManager entityManager) {
        this.em = entityManager;
    }
//	
//	@Autowired
//	public void setSession(SessionFactory sessionFactory){
//		this.setSessionFactory(sessionFactory);
//	}
	
//	private HibernateTemplate hibernateTemplate;
//
//	public void setSessionFactory(SessionFactory sessionFactory) 
//    {
//		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
//	}

	@Override
	public Subject saveSubject(Subject subject)  throws DataAccessException{
		getEntityManager().persist(subject);
		return subject;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Subject> listSubject()  throws DataAccessException{
		return getEntityManager().createQuery("from Subject").getResultList();
	}

}
