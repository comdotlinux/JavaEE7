package com.linux.javaee.example;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 *
 * @author guru.a.kulkarni
 */
@Model
public class Index {
    
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
        System.out.println("com.linux.javaee.example.Index.add( ) :: " + session);
        sessionStore.save(session);
        return null;
    }
}
