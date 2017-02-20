package org.alcobass.films.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Films implements EntryPoint {
    /**
     * Create a remote service proxy to talk to the server-side Greeting service.
     */
    private final FilmServiceAsync greetingService = GWT.create(FilmService.class);

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {

        // Add the nameField and sendButton to the RootPanel
        // Use RootPanel.get() to get the entire body element
        RootPanel.get().add(new Label("This is films application"));
    }
}
