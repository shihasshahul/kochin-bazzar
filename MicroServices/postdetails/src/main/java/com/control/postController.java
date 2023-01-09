package com.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postdetails.postDetails;
import com.repository.postRepo;

@RestController
@RequestMapping(value="/productdetails")
@CrossOrigin("http://localhost:4200/")
public class postController {
	
	@Autowired
	private postRepo PostRepository;
	
	@GetMapping
	public List<postDetails>GetPost(){
		return PostRepository.findAll();
	}
	
	@PostMapping
	public String AddPost(@RequestBody postDetails post) {
		PostRepository.save(post);
		return "post saved";
	}
	

}
