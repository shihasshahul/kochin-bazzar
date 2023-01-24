package com.postdetails;

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


@RestController
@RequestMapping(value="/post")
@CrossOrigin(origins="*")
public class postController {
	
	@Autowired
	private postRepo PostRepository;
	
	@GetMapping("/postdetails")
	public List<postDetails>GetPost(){
		return PostRepository.findAll();
	}
	
	@PostMapping("/postadd")
	public String AddPost(@RequestBody postDetails post) {
		PostRepository.save(post);
		return "post saved";
	}
	@DeleteMapping("/postdelete")
	public String deletePostData(@RequestParam(value="id")postDetails post) {
		PostRepository.delete(post);
		return "deleted";
		
	}
	

}
