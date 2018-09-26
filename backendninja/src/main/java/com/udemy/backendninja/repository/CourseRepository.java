/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.backendninja.repository;

import com.udemy.backendninja.entity.Course;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dell
 */
@Repository("courseRepository")
public interface CourseRepository extends JpaRepository<Course, Serializable>{
    
    
    public Course findByPrice(String name);
    
    public Course findByPriceAndName(int price, String name);
    
    public List<Course> findByNameOrderByHours(String name);
}
