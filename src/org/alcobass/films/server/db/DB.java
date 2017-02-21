package org.alcobass.films.server.db;

import java.util.List;

import org.alcobass.films.server.db.mappers.DictionaryMapper;
import org.alcobass.films.shared.beans.CountryBean;
import org.alcobass.films.shared.beans.GenreBean;

import com.google.inject.Inject;

public class DB implements DBInterface{
    
    @Inject
    private DictionaryMapper dictionaryMapper;
    
    
    public List<CountryBean> selectCountries() {
        return dictionaryMapper.selectCountries();
    }

    @Override
    public List<GenreBean> selectGenres() {
        return dictionaryMapper.selectGenres();
    }
}
