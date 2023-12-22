package com.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.ecommerce.madule.User;





public interface UserService {
	List<com.ecommerce.madule.User> getAllUsers();

    Optional<User> getUserById(int userId);

    User saveUser(User user);

    void deleteUser( int userId);
}