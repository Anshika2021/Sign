package com.retailapp.signupservice.rest;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.retailapp.signupservice.POJO.User;

@RequestMapping(path = "/user")
public interface UserRest {
	
@PostMapping(path = "/signup")
public ResponseEntity<String> signup(@RequestBody Map<String,String>requestMap);

@GetMapping(path="/getCartId/{email}")
public ResponseEntity<Integer>getCartId(@PathVariable String email);

@GetMapping("/user/{id}")
@ResponseBody
public User getUsersById(@PathVariable("id") Integer usr_id);
 

}
