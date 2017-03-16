package org.alcobass.films.client.gui.director;

import java.util.List;

import org.alcobass.films.shared.beans.DirectorBean;

public interface DirectorDisplay {
    public void setDirectorAddHandler(DirectorAddHandler directorAddHandler);
    public void setDirectorDeleteHandler(DirectorDeleteHandler directorDeleteHandler);
    public void setData(List<DirectorBean> data);
    public void redraw();
}
