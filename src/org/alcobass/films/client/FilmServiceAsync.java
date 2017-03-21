package org.alcobass.films.client;

import java.util.List;

import org.alcobass.films.shared.DictionaryCacheData;
import org.alcobass.films.shared.beans.CountryBean;
import org.alcobass.films.shared.beans.DirectorBean;
import org.alcobass.films.shared.beans.GenreBean;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface FilmServiceAsync {
    void loadDictionaryCache(AsyncCallback<DictionaryCacheData> callback);

    void getGenreBeanFake(AsyncCallback<GenreBean> callback);

    void getCountryBeanFake(AsyncCallback<CountryBean> callback);

    void getDirectorList(AsyncCallback<List<DirectorBean>> callback);
}
