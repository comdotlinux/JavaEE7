/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linux.javaee.example;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.event.Observes;

/**
 * And Event listener for {@linkplain TechnicalSession}
 * @author guru
 */
public class SessionListener {
    
    private static final Logger LOG = Logger.getLogger(SessionListener.class.getName());
    
    
    public void onStore(@Observes TechnicalSession ts){
        LOG.log(Level.INFO,"Observed save of :: {0}. Thanks for notification", ts);
    }
    
}
