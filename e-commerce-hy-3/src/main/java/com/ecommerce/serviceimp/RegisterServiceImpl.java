package com.ecommerce.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.madule.Register;
import com.ecommerce.repository.RegisterRepository;

import com.ecommerce.service.RegisterService;




@Service
public class RegisterServiceImpl implements RegisterService{
	  
	@Autowired
	    RegisterRepository registerRepository;
	@Override
	public List<Register> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Register> getUserById(int userId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Register saveUser(Register user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		
	}
	
	
}


