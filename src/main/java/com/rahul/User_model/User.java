package com.rahul.User_model;

public class User {    

    private int user_id;             //User class fields
    private int user_age;
    private String user_name;
    private String user_course;


    public User()
    {                            //Default Constructor

    }

   

    public User(int user_id, int age, String user_name, String user_course) {



        this.user_id = user_id;                  // fields initialization
        this.user_age = age;
        this.user_name = user_name;
        this.user_course = user_course;

    }

    

    public int getUser_id() {
        return user_id;                   //Getter for user_id
    }

    public int getUser_age() {
        return user_age;                  //Getter for user_age
    }

    public String getUser_name() {
        return user_name;                //Getter for user_name
    }

    public String getUser_course() {
        return user_course;               //Getter for user_course
    }


  //Overriding the default toString() method

    @Override
    public String toString() {
        return "User Message{"+"\"id\":" + '"'+user_id+'"' + ",\"name\":" + '"'+user_name+'"' + ",\"age\":" + '"'+user_age+'"' + ",\"course\":" + '"'+user_course+'"'  + "}";
    }


}
