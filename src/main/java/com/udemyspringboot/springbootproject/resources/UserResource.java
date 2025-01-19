package com.udemyspringboot.springbootproject.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemyspringboot.springbootproject.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User user = new User(null, "Carlos", "carlos@gmail.com", "+5543998079955", "123456");
		
		return ResponseEntity.ok().body(user);
		
	}

}
