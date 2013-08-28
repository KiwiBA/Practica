package com.barbeit.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.barbeit.domain.Subject;

public interface SubjectDAO{

	public Subject saveSubject(Subject subject) throws DataAccessException;

	public List<Subject> listSubject() throws DataAccessException;
}
