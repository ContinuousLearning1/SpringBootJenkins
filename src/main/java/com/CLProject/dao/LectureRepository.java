package com.CLProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CLProject.entity.Lecture;
@Repository
public interface LectureRepository extends JpaRepository<Lecture, Long> {

}
