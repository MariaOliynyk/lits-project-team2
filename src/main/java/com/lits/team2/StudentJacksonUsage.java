package com.lits.team2;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentJacksonUsage {
    public List<StudentDTO> loadStudents(String pathToJson) throws IOException {
        InputStream input = new FileInputStream(pathToJson);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objectMapper
                .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        TypeFactory typeFactory = TypeFactory.defaultInstance();
        return objectMapper.readValue(input,
                typeFactory.constructCollectionType(
                        ArrayList.class, StudentDTO.class));
    }
}
