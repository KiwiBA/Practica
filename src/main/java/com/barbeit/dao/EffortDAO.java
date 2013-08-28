package com.barbeit.dao;

import java.util.List;
import com.barbeit.domain.Effort;

public interface EffortDAO {
	
	public void saveEffort(Effort effort);

	public List<Effort> listEffort();

}
