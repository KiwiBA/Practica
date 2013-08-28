package com.barbeit.dao;

import java.util.List;
import com.barbeit.domain.Practical;

public interface PracticalDAO {
	
	public void savePractical(Practical practical);

	public List<Practical> listPractical();

}
