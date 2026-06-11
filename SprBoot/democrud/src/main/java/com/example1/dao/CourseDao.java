package com.example1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example1.entity.Course;

public interface CourseDao extends JpaRepository<Course, Long>{
	
}
