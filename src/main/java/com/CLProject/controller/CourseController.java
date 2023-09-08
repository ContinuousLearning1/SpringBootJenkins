package com.CLProject.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CLProject.entity.Course;
import com.CLProject.service.CourseService;

@RestController
public class CourseController {
	
//	@Autowired
//	private CourseService service;
//	
//	@PostMapping("/addCourse")
//	public ResponseEntity<Course> AddCourse(@RequestBody Course cs){
//		Course data=service.AddCourse(cs);
//		return new ResponseEntity<Course>(data,HttpStatus.CREATED);
//		
//	}
//	
//	@GetMapping("/{id}")
//	public ResponseEntity<Course> GetCourse(@PathVariable long id){
//		Course course=service.GetCourse(id);
//		if(course!=null) {
//			return new ResponseEntity<Course>(course,HttpStatus.OK);
//			
//		}
//		else {
//			return new ResponseEntity<Course>(course,HttpStatus.NOT_FOUND);
//		}
//	}
//
//	@PutMapping("/{id}")
//
//	public ResponseEntity<Course> UpateCourse(@PathVariable Long Id, @RequestBody Course cs){
//		Course data=service.UpdateCourse(Id,cs);
//		if(data!=null) {
//			return new ResponseEntity<Course>(data,HttpStatus.OK);
//		}
//		else {
//			return new ResponseEntity<Course>(data,HttpStatus.NOT_FOUND);
//		}
//	}
//	
//	@DeleteMapping("/{id}")
//	public ResponseEntity<Void> DeleteCourse(@PathVariable long id) {
//		boolean delete=service.Deletecourse(id);
//		if(delete) {
//			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		}
//			else {
//				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//			}
//		}
//		
	}
	 

