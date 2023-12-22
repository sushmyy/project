package com.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.ecommerce.madule.Register;



public interface RegisterService {
	
		List<Register> getAllUsers();

	    Optional<Register> getUserById(int userId);

	    Register saveUser(Register user);

	    void deleteUser(int userId);
	}


