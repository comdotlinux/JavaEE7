package com.linux.javaee.example;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author guru
 */
@Entity
public class TechnicalSession implements Serializable {
    
    @Id
    @GeneratedValue
    private long id;
    
    @NotNull
    @Size(min = 5, max = 10)
    private String sessionId;
    
    @NotNull
    @Size(min = 8, max = 20)
    private String name;

    public TechnicalSession(String sessionId, String name) {
        this.sessionId = sessionId;
        this.name = name;
    }

    public TechnicalSession() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public String toString() {
        return "TechnicalSession{" + "id=" + id + ", sessionId=" + sessionId + ", name=" + name + '}';
    }
    
    
}
