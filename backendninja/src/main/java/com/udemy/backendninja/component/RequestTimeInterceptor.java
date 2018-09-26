package com.udemy.backendninja.component;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 *
 * @author Dell
 */
@Component("requestTimeInterceptor")
public class RequestTimeInterceptor extends HandlerInterceptorAdapter {
    
    private static final Log LOGGER = LogFactory.getLog(RequestTimeInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest hsr, HttpServletResponse hsr1, Object o) throws Exception {
        hsr.setAttribute("requestTime", System.currentTimeMillis());
        return true;
    }
    
    @Override
    public void afterCompletion(HttpServletRequest hsr, HttpServletResponse hsr1, Object o, Exception excptn) throws Exception {
        long requestTime = (long) hsr.getAttribute("requestTime");
        LOGGER.info("Request URL: "+hsr.getRequestURL().toString()+" -- TIME -- "+(System.currentTimeMillis() - requestTime));
        if(hsr.getRequestURL().indexOf("ejercicio") != -1){
            LOGGER.info("TIME IN LOAD METHOD2 URL: "+hsr.getRequestURL().toString()+" -- TIME -- "+(System.currentTimeMillis() - requestTime));
        }
    }
    
}
