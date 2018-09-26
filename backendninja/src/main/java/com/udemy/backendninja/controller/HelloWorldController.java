/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.backendninja.controller;

import com.udemy.backendninja.Model.Person;
import com.udemy.backendninja.component.ExampleComponent;
import com.udemy.backendninja.service.impl.ExampleServiceImpl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Dell
 */
@Controller
@RequestMapping("/say")
public class HelloWorldController {
    
    public final String TEMPLATE = "helloworld";
    @Autowired
    @Qualifier("exampleComponent")
    private ExampleComponent exampleComponent;
    
    @Autowired
    @Qualifier("exampleService")
    private ExampleServiceImpl exampleServiceImpl;
    
    @GetMapping("/helloworld")
    public String helloWorld(Model model){
        model.addAttribute("people", exampleServiceImpl.getListPeople());
        exampleComponent.sayHello();
        return TEMPLATE;
    }
    @GetMapping("/helloworldMv")
    public ModelAndView exampleMV(){
        ModelAndView mov = new ModelAndView(TEMPLATE);
        mov.addObject("people", exampleServiceImpl.getListPeople());
        return mov;
    }
    
}
