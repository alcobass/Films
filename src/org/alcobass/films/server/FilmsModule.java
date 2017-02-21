package org.alcobass.films.server;

import javax.inject.Singleton;

import org.alcobass.films.server.db.DB;
import org.alcobass.films.server.db.DBInterface;

import com.google.inject.AbstractModule;

public class FilmsModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(DBInterface.class).to(DB.class).in(Singleton.class);
    }
}
