/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.backendninja.controller;

import com.udemy.backendninja.Model.CourseModel;
import com.udemy.backendninja.entity.Course;
import com.udemy.backendninja.service.CourseService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Dell
 */
@Controller()
@RequestMapping("/course")
public class CourseController {
    
    public static final String COURSE_VIEW = "courses";
    private static final Log LOG =  LogFactory.getLog(CourseController.class);
    
    @Autowired
    @Qualifier("courseServiceImpl")
    private CourseService courseService;
    
    @GetMapping("/listarcursos")
    public ModelAndView listarCursos(){
        ModelAndView mov = new ModelAndView(COURSE_VIEW);
        mov.addObject("course", new Course());
        mov.addObject("courses", courseService.findAllCourses());
        return mov;
    }
    
    @PostMapping("/guardarcurso")
    public String addCourse(@ModelAttribute("course") CourseModel courseModel){
        LOG.info("call: addCourse() --PARAMS-------"+courseModel);
        courseService.saveCourse(courseModel);
        return "redirect:/course/listarcursos";
    }
}
