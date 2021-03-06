package com.oraculum.cadastrobackend.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oraculum.cadastrobackend.entity.User;
import com.oraculum.cadastrobackend.repository.UserRepository;

@Service
public class PageService {
	
	@Autowired
    private UserRepository repository;
	
	 public List<User> getUsers(int page) {
         List<User> userList;

        for(int x=1;x<=page;x++){
            List<Integer> userPage = IntStream.rangeClosed(page*10-9, page+9)
        .boxed().collect(Collectors.toList());

        userList = repository.findAllById(userPage);
        }
        
        return userList;
	 }

}
