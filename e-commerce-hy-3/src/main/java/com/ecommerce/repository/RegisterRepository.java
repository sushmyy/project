package com.ecommerce.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.ecommerce.madule.Register;


@EnableJpaRepositories
@Repository
public interface RegisterRepository extends JpaRepository<Register, Integer>{
	
	
		
		Register findByUsername(String username);

		Register findByEmail(String email);

		Register save(Register user);
		}


