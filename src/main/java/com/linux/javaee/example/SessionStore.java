package com.linux.javaee.example;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author guru
 */
@Stateless
public class SessionStore {
   
    private static final Logger LOG = Logger.getLogger(SessionStore.class.getName());
    
    @PersistenceContext
    private EntityManager em;
    
    /**
     * 
     * @param ts
     */
    @Asynchronous
    public void save(TechnicalSession ts){
        LOG.log(Level.INFO, "Long running Database save operation started");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
           LOG.log(Level.SEVERE, null, ex);
        }
        
        TechnicalSession savedTs = this.em.merge(ts);
        LOG.log(Level.INFO, "Technical Session :: {0} saved", savedTs);
    }
}
