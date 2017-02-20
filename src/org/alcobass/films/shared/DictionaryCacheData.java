package org.alcobass.films.shared;

import java.util.List;

import org.alcobass.films.shared.beans.CountryBean;
import org.alcobass.films.shared.beans.GenreBean;

import com.google.gwt.user.client.rpc.IsSerializable;

public class DictionaryCacheData implements IsSerializable{
    private List<CountryBean> countryList;
    private List<GenreBean> genreList;
    
    public List<CountryBean> getCountryList() {
        return countryList;
    }
    public void setCountryList(List<CountryBean> countryList) {
        this.countryList = countryList;
    }
    public List<GenreBean> getGenreList() {
        return genreList;
    }
    public void setGenreList(List<GenreBean> genreList) {
        this.genreList = genreList;
    }
}
