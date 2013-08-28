package com.barbeit.dao;

import java.util.List;
import com.barbeit.domain.User;

public interface UserDAO {
	
	public void saveUser(User user) ;
	public List<User> listUser() ;
}