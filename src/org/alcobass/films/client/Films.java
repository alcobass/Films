package org.alcobass.films.client;

import org.alcobass.films.client.gui.MainPanel;
import org.alcobass.films.shared.DictionaryCacheData;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Films implements EntryPoint {
    /**
     * Create a remote service proxy to talk to the server-side Greeting service.
     */
    private static final FilmServiceAsync greetingService = GWT.create(FilmService.class);

    public static FilmServiceAsync getService() {
        return greetingService;
    }
    
    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {

        greetingService.loadDictionaryCache(new AsyncCallback<DictionaryCacheData>() {

            @Override
            public void onFailure(Throwable caught) {
                RootPanel.get().add(new Label("This is films application. error"));
                
            }

            @Override
            public void onSuccess(DictionaryCacheData result) {
                ClientDictionaryCache.init(result);
                RootPanel.get().add(new MainPanel());
                
            }
        });
        
    }
}
