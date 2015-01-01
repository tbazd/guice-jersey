package com.guje.rest.config;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.guje.rest.service.DataService;

/**
 * Guice config.
 *
 * Created on 12/25/14.
 */
public class GuiceConfig extends GuiceServletContextListener {

    public static Injector injector;

    @Override
    protected Injector getInjector() {
        injector =  Guice.createInjector(new ServletModule() {
            @Override
            protected void configureServlets() {
                bind(DataService.class);
            }
        });

        return injector;
    }
}
