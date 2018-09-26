/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.backendninja.service.impl;

import com.udemy.backendninja.service.IEjercicioService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dell
 */
@Service("ejercicioService")
public class EjercicioServiceImpl implements IEjercicioService{
    
    private static final Log LOGGER = LogFactory.getLog(EjercicioServiceImpl.class);
    
    @Override
    public void mensajeLog() {
        LOGGER.info("SERVICE EJERCICIO");
    }
    
}
