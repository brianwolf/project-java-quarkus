package org.brianlobo.configs;

import javax.enterprise.inject.Instance;
import javax.inject.Singleton;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.quarkus.jackson.ObjectMapperCustomizer;

public class ObjectMapperConfiguration {

    @Singleton
    ObjectMapper objectMapper(Instance<ObjectMapperCustomizer> customizers) {

        ObjectMapper mapper = new ObjectMapper();

        for (ObjectMapperCustomizer customizer : customizers) {
            customizer.customize(mapper);
        }

        return mapper;
    }
}
