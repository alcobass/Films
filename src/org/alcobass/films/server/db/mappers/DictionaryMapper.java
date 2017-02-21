package org.alcobass.films.server.db.mappers;

import java.util.List;

import org.alcobass.films.shared.beans.CountryBean;
import org.alcobass.films.shared.beans.GenreBean;

public interface DictionaryMapper {
    public List<CountryBean> selectCountries();
    public List<GenreBean> selectGenres();
}
