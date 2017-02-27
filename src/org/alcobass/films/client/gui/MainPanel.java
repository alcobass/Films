package org.alcobass.films.client.gui;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;

public class MainPanel extends Composite {

    private HorizontalPanel mainPanel;
    
    public MainPanel() {
        mainPanel = new HorizontalPanel();
        mainPanel.addStyleName("main-panel");
        
        SimplePanel filmPanel = new SimplePanel(new Label("Film Panel"));
        filmPanel.addStyleName("film-panel");
        mainPanel.add(filmPanel);
        
        SimplePanel directorPanel = new SimplePanel(new Label("Director Panel"));
        directorPanel.addStyleName("director-panel");
        mainPanel.add(directorPanel);

        
        initWidget(mainPanel);
    }
}
