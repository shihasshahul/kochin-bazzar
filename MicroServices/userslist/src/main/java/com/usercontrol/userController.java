package com.usercontrol;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userrepository.userRepo;
import com.userslist.userDetails;



@RestController
@RequestMapping(value="/users")
@CrossOrigin("http://localhost:4200/")

public class userController {
	@Autowired
	private userRepo UserRepository;
	
		@GetMapping("/userdetails")
		public List<userDetails>getuser(){
			return UserRepository.findAll();
			
		}
		@PostMapping("/adduser")
		public String AddEmp(@RequestBody userDetails user ) {
			UserRepository.save(user);
			return "saved";
		}
	

}