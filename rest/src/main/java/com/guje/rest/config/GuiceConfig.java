package com.guje.rest.config;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.guje.rest.service.DataService;

import javax.servlet.annotation.WebListener;

/**
 * Guice config.
 *
 * Annotation <code>@WebListener</code>
 * used for omitting <code>listener-class</code> declaration in web.xml
 *
 * Created on 12/25/14.
 */
@WebListener
public class GuiceConfig extends GuiceServletContextListener {

    @Override
    protected Injector getInjector() {
        return Guice.createInjector(new ServletModule() {
            @Override
            protected void configureServlets() {
                bind(DataService.class);
            }
        });
    }
}
