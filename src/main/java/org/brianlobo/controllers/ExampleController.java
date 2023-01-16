package org.brianlobo.controllers;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.brianlobo.configs.AppException;
import org.brianlobo.errors.ExampleServiceErrors;
import org.brianlobo.models.Example;
import org.brianlobo.services.ExampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/api/v1/examples")
public class ExampleController {

    private static Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Inject
    private ExampleService exampleService;

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMessages() {

        Example example = exampleService.getExample();

        logger.info(example.toString());

        return Response
                .status(200)
                .entity(example)
                .build();
    }

    @GET
    @Path("/error")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getError() throws AppException {
        throw new AppException(ExampleServiceErrors.BOOOM, "BOOOM");
    }
}