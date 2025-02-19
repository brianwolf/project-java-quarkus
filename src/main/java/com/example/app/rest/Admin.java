package com.example.app.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/v1/admin")
public class Admin {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response vars() {

        return Response
                .status(200)
                .entity(System.getenv())
                .build();
    }
}
