/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.backendninja.converter;

import com.udemy.backendninja.Model.CourseModel;
import com.udemy.backendninja.entity.Course;
import org.springframework.stereotype.Component;

/**
 *
 * @author Cesar Rodriguez
 */
@Component("courseConverter")
public class CourseConverter {
    
    public Course model2Entity(CourseModel courseModel){
        Course course = new Course();
        course.setDescription(courseModel.getDescription());
        course.setName(courseModel.getName());
        course.setPrice(courseModel.getPrice());
        course.setHours(courseModel.getHours());
        return course;
    }
    
    public CourseModel entity2Model(Course course){
        CourseModel courseModel = new CourseModel();
        courseModel.setDescription(course.getDescription());
        courseModel.setName(course.getName());
        courseModel.setPrice(course.getPrice());
        courseModel.setHours(course.getHours());
        return courseModel;
    }
    
}
