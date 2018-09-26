/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.backendninja.controller;

import com.udemy.backendninja.service.impl.EjercicioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Dell
 */
@Controller
@RequestMapping("ejercicio")
public class EjercicioController {
    
    private static final String TEMPLATE = "ejercicio";
    
    @Autowired
    @Qualifier("ejercicioService")
    private EjercicioServiceImpl ejercicioServiceImpl;
    
    @GetMapping("/metodo1")
    public String metodo1(){
        return "redirect:/ejercicio/metodo2";
        
    }
    @GetMapping("/metodo2")
    public ModelAndView metodo2(){
        ejercicioServiceImpl.mensajeLog();
        ModelAndView mv = new ModelAndView(TEMPLATE);
        mv.addObject("mensaje", "mensaje");
        return mv;
    }
}
