
package com.userslist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




import com.userslist.userDetails;





@RestController
@RequestMapping("/users")
@CrossOrigin(origins="*")
public class userController {
	@Autowired
	private userRepo UserRepository;
	
		@GetMapping("/userdetails")
		public List<userDetails> getuser(){
			return UserRepository.findAll();
			
		}
		
		@GetMapping({"","/"})
		public String Welcome() {
			return "Hello";
		}
		
		@PostMapping("/adduser")
		public String AddUser(@RequestBody userDetails user ) {
			UserRepository.save(user);
			return "saved";
		}
		
		@DeleteMapping("/userdelete")
		public String deleteUserData(@RequestParam(value="id")userDetails user) {
			UserRepository.delete(user);
			return "deleted";
			
		}
	
	

}