package com.demoproject.games;

import com.demoproject.games.models.Platform;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

/**
 * @author  Ahmed Salem
 */

@JsonComponent
public class PlatformJsonSerializer extends JsonSerializer<Platform>
{
      @Override
    public void serialize(Platform platform, JsonGenerator jsonGenerator,
                          SerializerProvider serializerProvider) throws IOException, JsonProcessingException {

              jsonGenerator.writeString(platform.getPlatform());
    }

}

