package org.brianlobo.configs;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class CustomExceptionHandler implements ExceptionMapper<AppException> {

    @Override
    public Response toResponse(AppException exception) {
        return Response
                .status(409)
                .entity(exception.toResponse())
                .build();
    }

}