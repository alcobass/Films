package org.alcobass.films.server;

import javax.inject.Inject;

import org.alcobass.films.server.db.DBInterface;

public class Server {
    @Inject
    private static Server server;
    
    @Inject
    private DBInterface db;
    
    public Server() {
    }
    
    public static DBInterface getDb() {
        return server.db;
    }
}
