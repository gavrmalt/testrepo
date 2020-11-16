package com.example.tutorial;

import java.util.jar.Attributes;

public class Person {

   private Name personName;
   private static int personCounter;

   public Person(Name personName){
       this.personName = personName;
   }

   public Person(){
       personCounter++;
       /*
       empty on perpose default constractor
        */
   }

    public String helloWorld() {

        return "hello world";
    }

    public String hello(String name) {

       return "hi " + name;
    }

    public static int numberOfPersons() {

       return personCounter;
    }
}



