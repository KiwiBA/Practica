package com.barbeit.dao;

import java.util.List;
import com.barbeit.domain.Team;

public interface TeamDAO {
	
	public void saveTeam(Team team);

	public List<Team> listTeam();

}
