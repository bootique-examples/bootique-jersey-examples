package io.bootique.rest.demo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class HelloApi {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String get() {
        return "{\"message\":\"Hello, Bootique!!\"}";
    }
}
