package org.alcobass.films.client;

import org.alcobass.films.shared.DictionaryCacheData;
import org.alcobass.films.shared.beans.CountryBean;
import org.alcobass.films.shared.beans.GenreBean;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface FilmService extends RemoteService {
    public DictionaryCacheData loadDictionaryCache();
    
    public GenreBean getGenreBeanFake();
    public CountryBean getCountryBeanFake();
}
