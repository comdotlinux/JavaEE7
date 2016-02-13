package com.linux.javaee.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 *
 * @author guru
 */
@Entity
public class TechnicalSession {
    
    @Id
    @GeneratedValue
    private String id;
    
    @Size(min = 8, max = 20)
    private String name;

    public TechnicalSession(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public TechnicalSession() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TechnicalSession{" + "id=" + id + ", name=" + name + '}';
    }
    
    
}
