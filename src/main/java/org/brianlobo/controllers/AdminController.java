package org.brianlobo.controllers;

import java.util.HashMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/")
public class AdminController {

    private static Logger logger = LoggerFactory.getLogger(AdminController.class);

    @ConfigProperty(name = "version")
    private String version;

    @GET
    @Path("/version")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getVersion() {

        HashMap<String, String> result = new HashMap<>();
        result.put("version", version);

        logger.info(String.format("version = %s", version));

        return Response
                .status(200)
                .entity(result)
                .build();
    }

    @GET
    @Path("/vars")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getVars() {

        HashMap<String, String> result = new HashMap<>();

        for (String name : ConfigProvider.getConfig().getPropertyNames()) {
            result.put(name, ConfigProvider.getConfig().getConfigValue(name).getValue());
        }

        return Response
                .status(200)
                .entity(result)
                .build();
    }

}
