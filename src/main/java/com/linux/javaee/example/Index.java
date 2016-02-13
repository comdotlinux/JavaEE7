package com.linux.javaee.example;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.interceptor.Interceptors;

/**
 *
 * @author guru.a.kulkarni
 */
@Model
@Interceptors(PerformanceMonitor.class)
public class Index {
    
    private static final Logger LOG = Logger.getLogger(Index.class.getName());
    
    @Inject
    private SessionStore sessionStore;
    
    @Inject
    Event<TechnicalSession> technicalSessionEvent;
    
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
        technicalSessionEvent.fire(session);
        return null;
    }
}
