package org.alcobass.films.client;

import java.util.List;

import org.alcobass.films.shared.DictionaryCacheData;
import org.alcobass.films.shared.beans.CountryBean;
import org.alcobass.films.shared.beans.GenreBean;

public class ClientDictionaryCache {
    private static List<CountryBean> countryList;
    private static List<GenreBean> genreList;
    
    public static List<CountryBean> getCountryList() {
        return countryList;
    }
    public static List<GenreBean> getGenreList() {
        return genreList;
    }
    
    public static void init(DictionaryCacheData dictionaryCacheData) {
        countryList = dictionaryCacheData.getCountryList();
        genreList = dictionaryCacheData.getGenreList();
    }
}
