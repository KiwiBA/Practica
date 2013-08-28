package com.barbeit.dao;

import java.util.List;
import com.barbeit.domain.Student;

public interface StudentDAO {
	
	public void saveStudent(Student student);

	public List<Student> listStudent();

}
