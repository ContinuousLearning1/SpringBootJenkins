package com.CLProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CLProject.entity.Admin;
import com.CLProject.service.Adminservice;

@RestController
public class AdminController {
	
	@Autowired
	private Adminservice service;
	
	/*
	 * Adding Admin details into DB
	 * **/
//	@PostMapping("/add")
//	public ResponseEntity<Admin> AddDetails(@RequestBody Admin admin){
//		Admin data=service.AddDetails(admin);
//		if(data==null) {
//			return new ResponseEntity<Admin>(data,HttpStatus.CREATED);
//			
//		}
//		return null;
//	}

	@PostMapping("/addAdmin")
	public ResponseEntity<Admin> addDetails(@RequestBody Admin admin) {
	    Admin data = service.AddDetails(admin);
	   return new ResponseEntity<Admin>(data,HttpStatus.CREATED);
	}

	/*
	 * Geting all Admin details
	 */
	
//	@GetMapping("/get")
//	public List<Admin> GetDetails(){
//		return service.GetDetails();
//	}

@GetMapping("/getAdmin")
public ResponseEntity<List<Admin>> getDetails() {
    List<Admin> admins = service.GetDetails();

    if (admins.isEmpty()) {
        return ResponseEntity.notFound().build();
    }

    return ResponseEntity.ok(admins);
}
}

