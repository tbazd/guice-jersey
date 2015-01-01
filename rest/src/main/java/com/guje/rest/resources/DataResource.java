package com.guje.rest.resources;

import com.google.inject.Inject;
import com.google.inject.servlet.RequestScoped;
import com.guje.rest.service.DataService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 * Data resource.
 *
 * Created on 12/25/14.
 */
@RequestScoped
@Path("/data")
public class DataResource {

    @Inject
    private DataService dataService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get(@Context UriInfo uriInfo) {
        return dataService.getData();
    }

}
