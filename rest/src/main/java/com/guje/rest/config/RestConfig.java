package com.guje.rest.config;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * Rest config.
 *
 * Created on 12/25/14.
 */
@ApplicationPath("rest")
public class RestConfig extends ResourceConfig {

    public RestConfig() {
        register(new BridgeConfig());
        packages("com.guje.rest.resources");
    }
}
