package com.oraculum.cadastrobackend.controller;

import java.util.List;

import org.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oraculum.cadastrobackend.entity.User;
import com.oraculum.cadastrobackend.service.PageService;

@RestController
@RequestMapping(value = "/page")
public class PageController {
	 
    
	@Autowired
	 private PageService service;

	@PostMapping
    public List<User> getPage(@RequestBody String params) {
        System.out.println(params);
        JSONObject page = new JSONObject(params);
        List<User> lista = service.getUsers(Integer.parseInt(page.getJSONObject("data").getString("page")));
		return lista;
    }
}