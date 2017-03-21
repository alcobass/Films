package org.alcobass.films.shared.beans;

import com.google.gwt.user.client.rpc.IsSerializable;

public class DirectorBean implements IsSerializable {
    private Integer id;
    private String name;
    private Integer countryId;
    
    
    public DirectorBean() {
        super();
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
    public Integer getCountryId() {
        return countryId;
    }
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }
    
}
