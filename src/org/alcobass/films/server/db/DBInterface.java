package org.alcobass.films.server.db;

import java.util.List;

import org.alcobass.films.shared.beans.CountryBean;
import org.alcobass.films.shared.beans.DirectorBean;
import org.alcobass.films.shared.beans.GenreBean;

public interface DBInterface {
    public List<CountryBean> selectCountries();
    public List<GenreBean> selectGenres();
    public List<DirectorBean> getDirectorList();
}
