package com.guje.rest.config;

import com.google.inject.Inject;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.jersey.server.ResourceConfig;
import org.jvnet.hk2.guice.bridge.api.GuiceBridge;
import org.jvnet.hk2.guice.bridge.api.GuiceIntoHK2Bridge;

import javax.ws.rs.ApplicationPath;

/**
 * Rest config.
 *
 * Created on 12/25/14.
 */
@ApplicationPath("rest")
public class RestConfig extends ResourceConfig {

    public RestConfig() {
        packages("com.fishday.rest");
        //register(RequestContextFilter.class);
    }

    @Inject
    public RestConfig(ServiceLocator serviceLocator) {
        packages("com.guje.rest.resources");

        GuiceBridge.getGuiceBridge().initializeGuiceBridge(serviceLocator);
        GuiceIntoHK2Bridge guiceBridge = serviceLocator.getService(GuiceIntoHK2Bridge.class);
        guiceBridge.bridgeGuiceInjector(GuiceConfig.injector);
    }
}
