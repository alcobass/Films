package org.alcobass.films.shared.beans;

import com.google.gwt.user.client.rpc.IsSerializable;

public class DirectorBean implements IsSerializable {
    private Integer id;
    private String name;
    
    
    public DirectorBean() {
        super();
    }
    public DirectorBean(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
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
        return "DirectorBean [id=" + id + ", name=" + name + "]";
    }
    
}
