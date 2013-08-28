package com.barbeit.web;

import javax.faces.bean.ManagedBean;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.barbeit.dao.SubjectDAO;
import com.barbeit.domain.Subject;

@ManagedBean(name="subjectCon")
@Service
public class SubjectController extends MultiActionController{
	
	private SubjectDAO subjectDAO;
	
	private String buttontestfield = "nixpassiert";
	
	public void setSubjectDAO(SubjectDAO subjectDAO) {
		this.subjectDAO = subjectDAO;
	}
	
	
	public SubjectDAO getSubjectDAO() {
		return subjectDAO;
	}


	@Transactional
	public ModelAndView add(HttpServletRequest request,
			HttpServletResponse response, Subject subject) throws Exception {
		subjectDAO.saveSubject(subject);
		return new ModelAndView("redirect:list.htm");
	}

	@Transactional
	public ModelAndView list(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("subjectList", subjectDAO.listSubject());
		modelMap.addAttribute("subject", new Subject());
		return new ModelAndView("subject", modelMap);
	}

	
	public void buttontest(){
		this.setButtontestfield("test erfolgreich");
	}
	
	public String getButtontestfield(){
		return buttontestfield;
		
	}


	public void setButtontestfield(String buttontestfields) {
		this.buttontestfield = buttontestfields;
	}
	
	
}
