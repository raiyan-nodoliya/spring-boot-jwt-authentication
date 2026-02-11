package com.learning.JWTAuthentication.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.learning.JWTAuthentication.Entity.User;

@Service
public class UserService {
	
	private List<User> store = new ArrayList();
	
	
	public UserService() {
		
		store.add(new User(UUID.randomUUID().toString(),"Raiyan Nodoliya","raiyan@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Ayesha Nodoliya","ayesha@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Mohammad Nodoliya","mohammad@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Saad Nodoliya","saad@gmail.com"));
	}
	
	
	public List<User> getUser(){
		return this.store;
	}

}
