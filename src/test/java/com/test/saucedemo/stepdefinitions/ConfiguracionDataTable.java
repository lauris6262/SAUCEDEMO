package com.test.saucedemo.stepdefinitions;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.cucumber.java.DefaultDataTableCellTransformer;
import io.cucumber.java.DefaultDataTableEntryTransformer;
import io.cucumber.java.DefaultParameterTransformer;

import java.lang.reflect.Type;

public class ConfiguracionDataTable {

    private final ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

    @DefaultParameterTransformer
    @DefaultDataTableCellTransformer
    @DefaultDataTableEntryTransformer(replaceWithEmptyString = "empty")
    public Object defaultTransformer(Object fromValue, Type toValueType) {
        JavaType javaType = objectMapper.constructType(toValueType);
        return objectMapper.convertValue(fromValue, javaType);
    }
}
