package com.ecommerce.madule;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





// User.java
@Entity
@Table(name = "User")
public class User {
	
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "userId")
	    private int id;

	    @Column(name = "Username", unique = true)
	    private String username;

	    @Column(name = "Password")
	    private String password;

	    @Column(name = "Email", unique = true)
	    private String email;

	    public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		@Column(name = "FirstName")
	    private String firstName;

	    @Column(name = "LastName")
	    private String lastName;

	    // Constructors, getters, and setters
	}
