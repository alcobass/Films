package org.alcobass.films.client.gui.director;

import java.util.ArrayList;
import java.util.List;

import org.alcobass.films.client.Films;
import org.alcobass.films.shared.beans.DirectorBean;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;

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
            public void onDirectorDelete(int index) {
                Window.alert("Delete clicked on " + String.valueOf(index));
            }
        });
    }
    
    public void loadData() {
        Films.getService().getDirectorList(new AsyncCallback<List<DirectorBean>>() {
            
            @Override
            public void onSuccess(List<DirectorBean> result) {
                loadedList = result;
                
                display.setData(loadedList);
                display.redraw();
            }
            
            @Override
            public void onFailure(Throwable caught) {
                // TODO Auto-generated method stub
                
            }
        });
    }
}
