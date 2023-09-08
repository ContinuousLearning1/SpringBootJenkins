package com.CLProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CLProject.entity.User;
import com.CLProject.service.UserService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class UserController {
	
//	@Autowired
//	private UserService service;
//	
//	@PostMapping("/addusers")
//	@CrossOrigin(origins = "http://localhost:4200")
//	public ResponseEntity<User> Addusers(@RequestBody User us){
//		User entity=service.AddUser(us);
//		
//		return new ResponseEntity<User>(entity,HttpStatus.CREATED);
//	}
//
//	@GetMapping("/getlist")
//	 @CrossOrigin(origins = "http://localhost:4200")
//	public List<User> GetDetails(){
//		return service.GetDetails();
//	}
//	@GetMapping("/excel")
//	public void getDatainExcel(HttpServletResponse response) throws Exception {
//		response.setContentType("application/octet-stream");
//		
//		String headerKey="Content-Disposition";
//		String headervalue="attachment;filename=userdetails.xls";
//		response.setHeader(headerKey, headervalue);
//		
//		service.getresponse(response);
//	}
//	@GetMapping("/count")
//	public long GetCount() {
//		return service.GetCount();
//	}
//	@GetMapping("/get{id}")
//	public User GetId(@PathVariable long id){
//		
//		return service.GetId(id);
//	}
//	
//	
//	@PutMapping("update{id}")
//	public User UpdateData(@PathVariable long id, User us) {
//	return service.Update(id,us);
//	
//	}
//	
//	@DeleteMapping("delete{id}")
//	public boolean Delete(@PathVariable long id) {
//		return service.Delete(id);
//	}
	
//	@GetMapping("/ascen")
//	public ResponseEntity<User> GetDetailsAsc(){
//		User data=service.GetDetailsAsc();
//		return new ResponseEntity<User>(data,HttpStatus.FOUND);
//	}
	
}
