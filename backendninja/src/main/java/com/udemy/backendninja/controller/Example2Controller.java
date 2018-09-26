/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.backendninja.controller;

import com.udemy.backendninja.Model.Person;
import javax.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Dell
 */
@Controller
@RequestMapping("/example2")
public class Example2Controller {
    
    public final String TEMPLATE = "example2";
    @GetMapping("/request1")
    public ModelAndView request1(@RequestParam(name = "nm", defaultValue = "NULL", required= false) String name, 
            @RequestParam(name="age", required = false, defaultValue = "0") Integer age){
        ModelAndView mv = new ModelAndView(TEMPLATE);
        mv.addObject("nm_in_model", new Person(name, age));
        return mv;
    }
    
    @GetMapping("/request2/{nm}/{age}")
    public ModelAndView request2(@PathVariable(name = "nm") String name, @PathVariable(name = "age") Integer age){
        ModelAndView mov = new ModelAndView(TEMPLATE);
        mov.addObject("nm_in_model", new Person(name, age));
        return mov;
    }
}
