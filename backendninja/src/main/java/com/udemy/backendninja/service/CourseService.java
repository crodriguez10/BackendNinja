/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.backendninja.service;

import com.udemy.backendninja.entity.Course;
import com.udemy.backendninja.repository.CourseRepository;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface CourseService{
    
    public List<Course> findAllCourses(); 
    
    public Course saveCourse(Course course);
    
    public Course updateCourse(Course course);
    
    public int deleteCourse(int id);
}
