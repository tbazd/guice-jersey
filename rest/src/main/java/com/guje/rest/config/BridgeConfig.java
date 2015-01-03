package com.guje.rest.config;

import com.guje.rest.service.DataService;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

/**
 * Guise Bride config.
 *
 * Created on 1/3/15.
 */
public class BridgeConfig extends AbstractBinder {
    @Override
    protected void configure() {
        bind(DataService.class).to(DataService.class);
    }
}
