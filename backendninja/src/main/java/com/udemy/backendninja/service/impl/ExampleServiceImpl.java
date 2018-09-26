/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.backendninja.service.impl;

import com.udemy.backendninja.Model.Person;
import com.udemy.backendninja.service.IExampleService;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dell
 */
@Service("exampleService")
public class ExampleServiceImpl implements IExampleService{
    
    private static final Log LOGGER = LogFactory.getLog(ExampleServiceImpl.class);

    @Override
    public List<Person> getListPeople() {
         List<Person> listPeople = new ArrayList<>();
        listPeople.add(new Person("Ninja", 26));
        listPeople.add(new Person("Juasc", 12));
        listPeople.add(new Person("DGFF", 17));
        LOGGER.info("**HELLO SERVICE**");
        return listPeople;
    }
    
}
