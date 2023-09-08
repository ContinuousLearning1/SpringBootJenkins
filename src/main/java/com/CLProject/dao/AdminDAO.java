package com.CLProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CLProject.entity.Admin;
@Repository
public interface AdminDAO extends JpaRepository<Admin, String> {

}
