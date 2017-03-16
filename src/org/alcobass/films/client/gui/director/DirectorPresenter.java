package org.alcobass.films.client.gui.director;

import java.util.ArrayList;
import java.util.List;

import org.alcobass.films.shared.beans.DirectorBean;

import com.google.gwt.user.client.Window;

public class DirectorPresenter {
    
    private DirectorDisplay display;
    private List<DirectorBean> loadedList;
    
    public DirectorPresenter(DirectorDisplay directorDisplay) {
        this.display = directorDisplay;
        
        bind();
        
    }
    
    private void bind() {
        display.setDirectorAddHandler(new DirectorAddHandler() {
            
            @Override
            public void onDirectorAdd() {
                Window.alert("Add clicked");
            }
        });
        
        display.setDirectorDeleteHandler(new DirectorDeleteHandler() {
            
            @Override
            public void onDirectorAdd(int index) {
                Window.alert("Delete clicked on " + String.valueOf(index));
            }
        });
    }
    
    public void loadData() {
        List<DirectorBean> newList = new ArrayList<DirectorBean>();
        newList.add(new DirectorBean(1, "Hithcock"));
        newList.add(new DirectorBean(2, "Lucas"));
        newList.add(new DirectorBean(3, "Михалков"));
        
        loadedList = newList;
        
        display.setData(loadedList);
        display.redraw();
    }
}
