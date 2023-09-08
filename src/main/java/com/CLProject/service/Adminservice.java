package com.CLProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CLProject.dao.AdminDAO;
import com.CLProject.entity.Admin;

@Service
public class Adminservice {
	
	@Autowired
	private AdminDAO dao;
	

	public Admin AddDetails(Admin admin) {
		
		return dao.save(admin);
	}


	


	public List<Admin> GetDetails() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
