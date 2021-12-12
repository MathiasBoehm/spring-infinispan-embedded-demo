package de.struktuhr.infinispandemo.entity;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {
    private String id;
    private String name;
    private Date created;

    public Customer(String id, String name, Date created) {
        this.id = id;
        this.name = name;
        this.created = created;
    }

    public Customer() {

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Customer [created=" + created + ", id=" + id + ", name=" + name + "]";
    }    
}
