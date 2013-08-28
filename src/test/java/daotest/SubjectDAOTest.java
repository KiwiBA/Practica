package daotest;


import static org.junit.Assert.*;

import java.util.List;
import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.barbeit.dao.SubjectDAO;
import com.barbeit.domain.Subject;
 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "/testApplicationContext.xml")
@Transactional
public class SubjectDAOTest{

	@Autowired
	private SubjectDAO subjectDAO;
	private Logger logger = Logger.getLogger("myLog");
	private Subject subject;
	
	@Before
	public void init(){
		this.subject = new Subject("prog1", "inf");
	}
	
//	@Test
//	public void saveSubjectTest() {
//		int expectedResult = 1;
//		Subject s = subjectDAO.saveSubject(subject);
//		Assert.assertEquals(expectedResult, subjectDAO.listSubject().size());
////		assertNotNull(s);
//	}
	
	public void listSubjectTest(){
		
	}
	
}
