package com.CLProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CLProject.dao.CourseRepository;
import com.CLProject.entity.Course;
@Service
public class CourseService {
	@Autowired
	private CourseRepository dao;

	public Course AddCourse(Course cs) {
		
		return dao.save(cs);
	}

	public Course GetCourse(long id) {
		
		return dao.findById(id).orElse(null);
	}

	public Course UpdateCourse(Long id, Course cs) {
		Course data=dao.findById(id).orElse(null);
		if(data!=null) {
			data.setTitle(cs.getTitle());
			data.setDescription(cs.getDescription());
			data.setCoverImage(cs.getCoverImage());
			data.setEnrollmentFee(cs.getEnrollmentFee());
			data.setEnrollmentStartDate(cs.getEnrollmentStartDate());
			data.setEnrollmentEndDate(cs.getCourseEndDate());
			data.setCourseStartDate(cs.getCourseStartDate());
			data.setCourseEndDate(cs.getCourseEndDate());
			data.setTotalDuration(cs.getTotalDuration());
			return dao.save(data);
		}
		return null;
	}

	public boolean Deletecourse(long id) {
		Course delete=dao.findById(id).orElse(null);
		if(delete!=null) {
			dao.delete(delete);
			return true;
		}
		return false;
	}

}
