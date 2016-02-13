package com.linux.javaee.example;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 * An Interceptor class for measuring method call time.
 * @author guru
 */
public class PerformanceMonitor {
   private static final Logger LOG = Logger.getLogger(PerformanceMonitor.class.getName());
    
    
    @AroundInvoke
    public Object measure(InvocationContext ic) throws Exception{
        LOG.log(Level.INFO,"Measuring performance of :: {0}", ic.getMethod());
       long startTime = System.nanoTime();
       try{
        return ic.proceed();
       } finally {
           LOG.log(Level.INFO,"Called method {0}", ic.getMethod());
           long timeTaken = (System.nanoTime() - startTime) / 1000000l;
           LOG.log(Level.INFO,"Time elapsed for method call :: {0} milliseconds.",timeTaken);
       }
    }
    
}
