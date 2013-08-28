package com.barbeit.dao;

import java.util.List;
import com.barbeit.domain.Group;

public interface GroupDAO {
	
	public void saveGroup(Group group);

	public List<Group> listGroup();

}
