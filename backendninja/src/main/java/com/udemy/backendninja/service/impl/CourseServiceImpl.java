/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.backendninja.service.impl;

import com.udemy.backendninja.Model.CourseModel;
import com.udemy.backendninja.converter.CourseConverter;
import com.udemy.backendninja.entity.Course;
import com.udemy.backendninja.repository.CourseRepository;
import com.udemy.backendninja.service.CourseService;
import java.util.ArrayList;
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
    
    @Autowired
    @Qualifier("courseConverter")
    CourseConverter courseConverter;
    
    private static final Log LOG =  LogFactory.getLog(CourseServiceImpl.class);
    
    @Override
    public List<CourseModel> findAllCourses() {
        LOG.info("Call: findAllCourses()");
        List<CourseModel> listCourseModel = new ArrayList<>();
        
        courseRepository.findAll().forEach((course) -> {
            listCourseModel.add(courseConverter.entity2Model(course));
        });
        
        return listCourseModel;
    }

    @Override
    public CourseModel saveCourse(CourseModel courseModel) {
        LOG.info("Call: saveCourse()");
        return courseConverter.entity2Model(courseRepository.save(courseConverter.model2Entity(courseModel)));
    }

    @Override
    public CourseModel updateCourse(CourseModel courseModel) {
        return courseConverter.entity2Model(courseRepository.save(courseConverter.model2Entity(courseModel)));
    }

    @Override
    public int deleteCourse(int id) {
        courseRepository.deleteById(id);
        return 0;
    }

    
}
