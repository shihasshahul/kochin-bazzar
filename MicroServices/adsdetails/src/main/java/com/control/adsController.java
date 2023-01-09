package com.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adsdetails.adsDetails;
import com.repository.adsRepo;

@RestController
@RequestMapping(value="/adsdetails")
@CrossOrigin("http://localhost:4200/")
public class adsController {
	@Autowired
	private adsRepo AdsRepository;
	
	@GetMapping
	public List<adsDetails>GetAds(){
		return AdsRepository.findAll();
	}
	
	@PostMapping
	public String AddAds(@RequestBody adsDetails post) {
		AdsRepository.save(post);
		return "ads added";
	}
	

}
