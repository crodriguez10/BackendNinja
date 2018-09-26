/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.backendninja.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


/**
 *
 * @author Dell
 */
@ControllerAdvice
public class ErrorsController {
    
    public final String SIE_VIEW = "error/500";
    
    @ExceptionHandler(Exception.class)
    public String showInternalServerError(){
        return SIE_VIEW;
    }
}
