package com.retailapp.signupservice.service;

import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.retailapp.signupservice.POJO.User;

public interface UserService {

	ResponseEntity<String> signUp(Map<String, String> requestMap);

	ResponseEntity<Integer> getCartId(String email);
	
	//new find by id
	
	User findById(Integer l);

}
