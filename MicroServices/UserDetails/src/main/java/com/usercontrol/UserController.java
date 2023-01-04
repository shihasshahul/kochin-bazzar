package com.usercontrol;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userdetails.UserDetails;
import com.userrepo.UserRepo;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserRepo userrepository;
	
	@GetMapping("userlist")
	public List<UserDetails> getusers(){
		return userrepository.findAll();
	}

}
