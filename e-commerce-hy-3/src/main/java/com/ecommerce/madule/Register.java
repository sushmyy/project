package com.ecommerce.madule;

//User.java
import javax.persistence.*;

@Entity
public class Register {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column(nullable = false, unique = true)
 private String username;

 @Column(nullable = false, unique = true)
 private String email;

 @Column(nullable = false)
 private String password;

 // Other user properties can be added as needed

 // Constructors, getters, and setters

 public Register() {
     // Default constructor for JPA
 }

 public Register(String username, String email, String password) {
     this.username = username;
     this.email = email;
     this.password = password;
 }

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

 // Getters and setters
}
