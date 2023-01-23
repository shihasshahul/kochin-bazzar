package com.adsdetails;

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
@RequestMapping(value="/ads")
@CrossOrigin("https://kochinbazzarapp.web.app/")
public class adsController {
	@Autowired
	private adsRepo AdsRepository;
	
	@GetMapping("/adsdetails")
	public List<adsDetails>GetAds(){
		return AdsRepository.findAll();
	}
	
	@PostMapping("/adsadded")
	public String AddAds(@RequestBody adsDetails post) {
		AdsRepository.save(post);
		return "ads added";
	}
	
	@DeleteMapping("/adsdelete")
	public String deleteFavData(@RequestParam(value="id")adsDetails ads) {
		AdsRepository.delete(ads);
		return "ads deleted";
		
	}
	

}
