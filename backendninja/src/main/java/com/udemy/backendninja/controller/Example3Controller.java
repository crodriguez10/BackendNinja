/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.backendninja.controller;

import com.udemy.backendninja.Model.Person;
import javax.validation.Valid;
import javax.xml.ws.BindingType;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Dell
 */
@Controller
@RequestMapping("/example3")
public class Example3Controller {
    
    public final String FORM = "form";
    public final String RESULT = "result";

    public static final Log LOGGER = LogFactory.getLog(Example3Controller.class);
    
    @GetMapping("/form")
    public String showForm(Model model){
        model.addAttribute("person", new Person());
        return FORM;
    }
    
    @PostMapping("/addPerson")
    public ModelAndView addPerson(@Valid Person person, BindingResult bindingResult){
        
        ModelAndView mv = new ModelAndView();
        if(bindingResult.hasErrors()){
            mv.setViewName(FORM);
        }else{
            mv.setViewName(RESULT);
            mv.addObject("person", person);
            LOGGER.info("METHOD: addPerson --- object: '"+person+"'");
        }
        
        return mv;
    }
    
    @GetMapping("/")
    public String redirect(){
        return "redirect:/example3/form";
    }
    
    /*@GetMapping("/")
    public RedirectView redirectView(){
        return new RedirectView("/example3/form");
        
    }*/
}
