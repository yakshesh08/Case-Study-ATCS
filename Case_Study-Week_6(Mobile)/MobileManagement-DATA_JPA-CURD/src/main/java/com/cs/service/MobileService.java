package com.cs.service;

import java.util.Optional;

import com.cs.entity.Mobile;

public interface MobileService {
	
	Mobile addMobile(Mobile mobile);
	
	Mobile updateMobile(Mobile mobile);
	
	void deleteMobile(int mobId);
	
	Optional<Mobile> getMobile(int mobId);
	
	Iterable<Mobile> getAllMobiles();
	
	

}
