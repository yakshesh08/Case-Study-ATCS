package com.cs.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs.dao.Mobiledao;
import com.cs.entity.Mobile;

@Service
@Transactional
public class MobileSeriveImpl implements MobileService {
	
	@Autowired
	Mobiledao dao;
	
	@Override
	public Mobile addMobile(Mobile mobile) {
		return dao.save(mobile);
	}
	
	@Override
	public Mobile updateMobile(Mobile mobile) {
		return dao.save(mobile);
		
	}
	
	@Override
	public void deleteMobile(int mobId) {
			dao.deleteById(mobId);
		
	}
	
	@Override
	public Optional<Mobile> getMobile(int mobId){
		return dao.findById(mobId);
	}
	
	@Override
	public Iterable<Mobile> getAllMobiles() {
		
		return dao.findAll();
	}
	
	
	

}
