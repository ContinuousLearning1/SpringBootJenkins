package com.CLProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CLProject.dao.LectureRepository;
import com.CLProject.entity.Lecture;

@Service
public class LectureService {

	@Autowired
	private LectureRepository dao;

	public Lecture AddLectureDetails(Lecture data) {	
		return dao.save(data);
	}
	
	
}
