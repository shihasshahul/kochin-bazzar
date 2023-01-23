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
@RequestMapping(value="/fav")
@CrossOrigin("http://localhost:4200/")
public class favouritesController {

	@Autowired
	private favouritesRepo favouritesRepository;
	
	@GetMapping("/favdetails")
	public List<favouritesDetails>GetFav(){
		return favouritesRepository.findAll();
	}
	
	@PostMapping("/favadd")
	public String AddFav(@RequestBody favouritesDetails post) {
		favouritesRepository.save(post);
		return "favourites added";
	}
	@DeleteMapping("/favdelete")
	public String deleteFavData(@RequestParam(value="id")favouritesDetails fav) {
		favouritesRepository.delete(fav);
		return "fav deleted";
		
	}
}
