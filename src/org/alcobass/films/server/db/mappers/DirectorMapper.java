package org.alcobass.films.server.db.mappers;

import java.util.List;

import org.alcobass.films.shared.beans.DirectorBean;

public interface DirectorMapper {
    public List<DirectorBean> getDirectorList();
}
