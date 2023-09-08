package com.CLProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CLProject.entity.Lecture;
import com.CLProject.service.LectureService;

@RestController
public class LectureController {
//	@Autowired
//	private LectureService service;
//	public ResponseEntity<Lecture> AddLectureDetails(@RequestBody Lecture data){
//		Lecture entity=service.AddLectureDetails(data);
//		return new ResponseEntity<Lecture>(entity,HttpStatus.CREATED);
//	}

}
