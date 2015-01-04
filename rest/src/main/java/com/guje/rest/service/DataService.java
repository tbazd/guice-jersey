package com.guje.rest.service;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Data service.
 *
 * Created on 12/25/14.
 */
@Singleton
public class DataService {

    public static final String DATA = "SomeData";

    public String getData() {
        return DATA;
    }

}
