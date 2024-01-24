package com.example.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.binding.VoteRegister;
import com.example.entity.VoterRegisterEntity;
import com.example.repository.VoterRegisterRepository;

@Service
public class VoterRegistrationService {

	@Autowired
	private VoterRegisterRepository repo;
	
	public void SaveData(VoteRegister v) {
		
		VoterRegisterEntity entity=new VoterRegisterEntity();
		BeanUtils.copyProperties(v, entity);
		repo.save(entity);
		
	}
}
