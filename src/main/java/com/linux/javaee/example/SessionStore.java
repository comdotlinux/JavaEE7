package com.linux.javaee.example;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author guru
 */
@Stateless
public class SessionStore {
   
    @PersistenceContext
    private EntityManager em;
    
    public void save(TechnicalSession ts){
        this.em.merge(ts);
    }
}
