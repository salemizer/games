package com.demoproject.games;

import com.demoproject.games.models.Report;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;
import java.util.List;

/**
 * @author  Ahmed Salem
 */

@JsonComponent
    public class ReportJsonSerializer extends JsonSerializer<Report>
         {

        @Override
        public void serialize(Report report, JsonGenerator jsonGenerator,
                              SerializerProvider serializerProvider) throws IOException,
                JsonProcessingException {

            jsonGenerator.writeStartObject();

            jsonGenerator.writeStringField("user_with_most_comments", report.getUser_with_most_comments());
            jsonGenerator.writeStringField("highest_rated_game", report.getHighest_rated_game());


            jsonGenerator.writeFieldName("average_likes_per_game");
            jsonGenerator.writeStartArray();

            List list = report.getAverage_likes_per_game();

        for(Object obj:list){
            if(obj instanceof Object[]){
                Object[] obj_arr = (Object[]) obj;

                jsonGenerator.writeStartObject();

                for(Object o:obj_arr){
                    if(o instanceof String){
                        jsonGenerator.writeStringField("title", o.toString());
                    }
                    if(o instanceof Double){
                        double d =Double.parseDouble(o.toString());
                        int i = (int) Math.round(d);
                        jsonGenerator.writeNumberField("average_likes", i);
                    }
                }

                jsonGenerator.writeEndObject();
            }

        }

            jsonGenerator.writeEndArray();

            jsonGenerator.writeEndObject();
        }

    }

