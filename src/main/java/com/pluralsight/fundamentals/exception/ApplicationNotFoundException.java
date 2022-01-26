package com.pluralsight.fundamentals.exception;

import graphql.*;
import graphql.language.SourceLocation;

import java.util.*;

public class ApplicationNotFoundException extends RuntimeException implements GraphQLError {
    private Map<String, Object> extensions = new HashMap<>();

    public ApplicationNotFoundException(String message, Long invalidApplicationId) {
        super(message);
        extensions.put("invalidApplicationId", invalidApplicationId);
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public Map<String, Object> getExtensions() {
        return extensions;
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.DataFetchingException;
    }

}
