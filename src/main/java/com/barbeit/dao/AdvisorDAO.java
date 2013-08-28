package com.barbeit.dao;

import java.util.List;
import com.barbeit.domain.Advisor;

public interface AdvisorDAO {
	
	public void saveAdvisor(Advisor advisor);

	public List<Advisor> listAdvisor();

}
