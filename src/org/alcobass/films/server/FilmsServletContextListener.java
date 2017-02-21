package org.alcobass.films.server;

import java.util.Properties;

import org.alcobass.films.server.db.DB;
import org.alcobass.films.server.db.DBInterface;
import org.mybatis.guice.XMLMyBatisModule;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import com.google.inject.servlet.GuiceServletContextListener;

public class FilmsServletContextListener extends GuiceServletContextListener{
        @Override
        protected Injector getInjector() {
            final Properties props = new Properties();
            props.setProperty("db.user", "test");
            props.setProperty("db.password", "123");
            props.setProperty("jdbc.url", "jdbc:postgresql://192.168.0.14:5432/FILM");

            Injector injector = Guice.createInjector(
                new XMLMyBatisModule() {

                    @Override
                    protected void initialize() {
                        setClassPathResource("mybatis-config.xml");
                        addProperties(props);
                        setEnvironmentId("development");
                    }

                },
                new AbstractModule() {
                    
                    @Override
                    protected void configure() {
                        requestStaticInjection(Server.class);
                        bind(DBInterface.class).to(DB.class).in(Singleton.class);
                    }
                }
            );
            
            return injector;
        }
}
