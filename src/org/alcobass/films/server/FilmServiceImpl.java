package org.alcobass.films.server;

import java.util.List;

import javax.inject.Inject;

import org.alcobass.films.client.FilmService;
import org.alcobass.films.server.db.DBInterface;
import org.alcobass.films.shared.DictionaryCacheData;
import org.alcobass.films.shared.beans.CountryBean;
import org.alcobass.films.shared.beans.DirectorBean;
import org.alcobass.films.shared.beans.GenreBean;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class FilmServiceImpl extends RemoteServiceServlet implements
        FilmService {

    @Inject
    protected DBInterface database;

    
    @Override
    public DictionaryCacheData loadDictionaryCache() {
        DictionaryCacheData res = new DictionaryCacheData();
        
        /*// Generate countries
        List<CountryBean> countryList = new ArrayList<CountryBean
        >();
        countryList.add(new CountryBean(1, "Россия"));
        countryList.add(new CountryBean(2, "Германия"));
        countryList.add(new CountryBean(3, "США"));
        res.setCountryList(countryList);*/
        
        // Generate countries
        List<CountryBean> countryList = Server.getDb().selectCountries();
        res.setCountryList(countryList);

        /*// Generate genres       
        List<GenreBean> genreList = new ArrayList<GenreBean>();
        genreList.add(new GenreBean(1, "Боевик"));
        genreList.add(new GenreBean(2, "Комедия"));
        genreList.add(new GenreBean(3, "Мелодрама"));
        res.setGenreList(genreList);*/
        
        List<GenreBean> genreList = Server.getDb().selectGenres();
        res.setGenreList(genreList);

        return res;
    }

    @Override
    public GenreBean getGenreBeanFake() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CountryBean getCountryBeanFake() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<DirectorBean> getDirectorList() {
        return Server.getDb().getDirectorList();
    }

}
