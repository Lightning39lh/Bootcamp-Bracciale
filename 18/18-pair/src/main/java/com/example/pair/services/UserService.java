
package com.example.pair.services;

import com.example.pair.model.User;
import com.example.pair.repositories.UserRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;



@Service
public class UserService {
	@Autowired
	UserRepository ur;
	
	public List<User> getAllUsers(){
		return (List<User>) ur.findAll();
	}
	
	public User getOneUser(int id) {
		return ur.findById(id).get();
	
	}
	
	public boolean saveUser(User user) {
		if(ur.existsByUsername(user.getUsername())) return false;
		ur.save(user);
		return true;
	}
}
