package com.linux.javaee.example;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 *
 * @author guru.a.kulkarni
 */
@Model
public class Index {
    
    private static final Logger LOG = Logger.getLogger(Index.class.getName());
    
    @Inject
    private SessionStore sessionStore;
    
    private TechnicalSession session;
    
    @PostConstruct
    public void onInit(){
        this.session = new TechnicalSession();
    }
        
    public TechnicalSession getSession(){
        return session;
    }
    
    public Object add(){
        LOG.log(Level.INFO, "com.linux.javaee.example.Index.add( ) :: {0}", session);
        sessionStore.save(session);
        return null;
    }
}
