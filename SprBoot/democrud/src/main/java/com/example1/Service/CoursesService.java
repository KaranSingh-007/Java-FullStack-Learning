package com.example1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example1.dao.CourseDao;
import com.example1.entity.Course;

@Service
public class CoursesService implements CourseService{
	
	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Course> getCourse(){
		return courseDao.findAll();
	}
	@Override
	public Course getCourse(long courseId) {
		return courseDao.findById(courseId).get();
	}
	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}
	@Override
	public void deleteCourse(long parseLong) {
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}
}