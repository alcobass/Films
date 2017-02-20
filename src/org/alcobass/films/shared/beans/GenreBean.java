package org.alcobass.films.shared.beans;

import com.google.gwt.user.client.rpc.IsSerializable;

public class GenreBean implements IsSerializable {
    private Integer id;
    private String name;
    
    public GenreBean() {
        super();
    }
    public GenreBean(Integer id, String name) {
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
        return "GenreBean [id=" + id + ", name=" + name + "]";
    }
    
}
