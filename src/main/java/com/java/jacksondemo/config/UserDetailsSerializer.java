package com.java.jacksondemo.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.java.jacksondemo.model.UserDetails;

import java.io.IOException;

public class UserDetailsSerializer extends StdSerializer<UserDetails> {

    private final JacksonDemoProperties jacksonDemoProperties;

    protected UserDetailsSerializer(JacksonDemoProperties jacksonDemoProperties) {
        super(UserDetails.class);
        this.jacksonDemoProperties = jacksonDemoProperties;
    }

    @Override
    public void serialize(UserDetails userDetails, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeNumberField("user-id", userDetails.getUserId());
        jsonGenerator.writeStringField("first-name", userDetails.getFirstName());
        if (jacksonDemoProperties.isSerializeSensitiveInfo()) {
            jsonGenerator.writeStringField("ssn", userDetails.getSsn());
            jsonGenerator.writeNumberField("age", userDetails.getAge());
        }
        jsonGenerator.writeEndObject();
    }
}
