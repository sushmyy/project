package com.ecommerce.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ecommerce.madule.User;
import com.ecommerce.repository.UserRepository;
import com.ecommerce.service.UserService;


@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    
    

    public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public Optional<User> getUserById(int userId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		
	}

	
    // Add other service methods as needed
}
