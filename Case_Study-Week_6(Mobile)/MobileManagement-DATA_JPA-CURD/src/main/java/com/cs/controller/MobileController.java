package com.cs.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cs.entity.Mobile;
import com.cs.service.MobileService;


@RestController
@RequestMapping("/mobile")  //http://localhost:1111/mobile
public class MobileController {
	
	@Autowired
	MobileService service;
	
	@PostMapping("/addMobile")    //http://localhost:1111/mobile/addMobile
	public Mobile addMobile(@RequestBody Mobile mob) {
				
		return service.addMobile(mob);
	}
	
	@PutMapping("/updateMobile") //http://localhost:1111/mobile/updateMobile
	public Mobile updateMobile(@RequestBody Mobile mob) {
		return service.updateMobile(mob);
	}
	
	@GetMapping("/getMobile/{mid}")    //http://localhost:1111/mobile/getMobile/mid
	public Optional<Mobile> getMobile(@PathVariable("mid") int mobId){
		return service.getMobile(mobId);
	}
	
	
	
	@GetMapping("/getAllMobiles")
		public Iterable<Mobile> getAllMobiles(){
			return service.getAllMobiles();
		}
	
	
	@DeleteMapping("/deleteMobile/{mid}")
	public void deleteMobile(@PathVariable("mid") int mobId){
		
		service.deleteMobile(mobId);
		
	}
	
	

}
