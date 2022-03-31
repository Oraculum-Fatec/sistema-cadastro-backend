package com.oraculum.cadastrobackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_tb")
public class User {
	
	    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    
	    @Column(length = 70)
	    private String name;
	    
	    @Column(length = 50)
	    private String password;
	    
	    @Column(length = 70)
	    private String email;
	    
	    @Column(length = 15)
	    private String phone;
	
}
