package com.rahul.SerializedDeserialized;

import com.rahul.User_model.User;

import org.apache.kafka.common.serialization.Deserializer;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.Map;

public class Deserialization implements Deserializer<User> {


    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {

    }

    @Override
    public User deserialize(String s, byte[] bytes) {

        if (bytes == null) {
            System.out.println("Null value received at deserialize");
            return null;
        }

            User user=null;

            ObjectMapper om=new ObjectMapper();
        try {
            user=om.readValue(bytes,User.class); 
        } catch (IOException e) {
            e.printStackTrace();
        }


        return user;
    }



    @Override
    public void close() {

    }
}
