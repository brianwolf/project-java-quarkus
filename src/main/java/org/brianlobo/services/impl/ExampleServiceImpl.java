package org.brianlobo.services.impl;

import java.util.Date;

import javax.inject.Singleton;

import org.brianlobo.models.Example;
import org.brianlobo.services.ExampleService;

@Singleton
public class ExampleServiceImpl implements ExampleService {

    @Override
    public Example getExample() {
        return Example.builder()
                .str("Hello")
                .date(new Date())
                .doubleVar(1.5)
                .integer(10)
                .build();
    }

}