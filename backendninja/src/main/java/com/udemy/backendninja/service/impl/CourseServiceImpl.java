/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.backendninja.service.impl;

import com.udemy.backendninja.entity.Course;
import com.udemy.backendninja.repository.CourseRepository;
import com.udemy.backendninja.service.CourseService;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dell
 */
@Service("courseServiceImpl")
public class CourseServiceImpl implements CourseService{

    @Autowired
    @Qualifier("courseRepository")        
    CourseRepository courseRepository;
    
    private static final Log LOG =  LogFactory.getLog(CourseServiceImpl.class);
    
    @Override
    public List<Course> findAllCourses() {
        LOG.info("Call: findAllCourses()");
        return courseRepository.findAll();
    }

    @Override
    public Course saveCourse(Course course) {
        LOG.info("Call: saveCourse()");
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public int deleteCourse(int id) {
        courseRepository.deleteById(id);
        return 0;
    }

    
}
