package com.rahul.Kafka_ConsumerProducer_Class;

import com.rahul.User_model.User;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.*;

public class Producer {

    public static void main(String[] args) {

        Properties p=new Properties();
        p.put("bootstrap.servers","localhost:9092");
        p.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
        p.put("value.serializer","com.rahul.SerializedDeserialized.Serialization"); 



      KafkaProducer<String,User> kp=new KafkaProducer<String, User>(p);

      //Setting values to the User Object.

        User user1=new User(1,21,"rahul","B.Tech");
        User user2=new User(2,23,"rajan","Bse");
        User user3=new User(3,22,"amit","B.com");

     

          Random rand = new Random();           //Generating random values in order to make key unique.

      


        try {


           //Passing topic attributes

           kp.send(new ProducerRecord("User",Integer.toString(rand.nextInt(10000)),user1));

          ;

           kp.send(new ProducerRecord("User",Integer.toString(rand.nextInt(10000)),user2));

           ;
       
           kp.send(new ProducerRecord("User",Integer.toString(rand.nextInt(10000)),user3));
       

       }
       catch (Exception e)
       {
           System.out.println("Exception:"+e);
       }
       finally {
           kp.close();
       }


    }

}
