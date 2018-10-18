/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.backendninja.Model;

/**
 *
 * @author Cesar Rodriguez
 */
public class CourseModel {
    
    private String description;
    private int hours;
    private String name;
    private int price;

    public CourseModel() {
    }
    
    public CourseModel(String description, int hours, String name, int price, int id) {
        this.description = description;
        this.hours = hours;
        this.name = name;
        this.price = price;
    }    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
    
}
