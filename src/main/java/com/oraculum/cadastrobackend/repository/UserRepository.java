package com.oraculum.cadastrobackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oraculum.cadastrobackend.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
