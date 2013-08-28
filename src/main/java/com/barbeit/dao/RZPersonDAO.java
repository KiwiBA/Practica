package com.barbeit.dao;

import java.util.List;
import com.barbeit.domain.RZPerson;

public interface RZPersonDAO {
	
	public void saveRZPerson(RZPerson rzPerson);

	public List<RZPerson> listRZPerson();

}
