/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.backendninja.service;

import com.udemy.backendninja.Model.CourseModel;
import com.udemy.backendninja.entity.Course;
import com.udemy.backendninja.repository.CourseRepository;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface CourseService{
    
    public List<CourseModel> findAllCourses(); 
    
    public CourseModel saveCourse(CourseModel course);
    
    public CourseModel updateCourse(CourseModel course);
    
    public int deleteCourse(int id);
}
