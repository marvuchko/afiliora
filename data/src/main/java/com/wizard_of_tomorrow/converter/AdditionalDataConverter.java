package com.wizard_of_tomorrow.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Map;

@Slf4j
@Converter
public class AdditionalDataConverter implements AttributeConverter<Map<String, Object>, String> {

    private static final ObjectMapper mapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(Map<String, Object> additionalData) {
        try {
            return mapper.writeValueAsString(additionalData);
        } catch (JsonProcessingException error) {
            log.warn("Couldn't convert {} to database column.", additionalData, error);
            return null;
        }
    }

    @Override
    public Map<String, Object> convertToEntityAttribute(String column) {
        return mapper.convertValue(column, new TypeReference<Map<String, Object>>() {});
    }

}
