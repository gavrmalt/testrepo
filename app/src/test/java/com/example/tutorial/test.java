package com.example.tutorial;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class test {

    @Test
    public void shouldReturnHelloWorld() {

        Person gav = new Person();
        assertEquals("hello world", gav.helloWorld());

    }

    @Test
    public void shouldReturnGav() {

        Person person = new Person();
        assertEquals("hi gav", person.hello("gav"));

    }

    @Test
    public void shouldReturnNumberOfPersons() {

        int i = 0;


        while(i<4){
            Person person1 = new Person();
            i++;
        }



        assertEquals(4, Person.numberOfPersons());

    }




    @Test
    public void demonstrateBoolean(){
        Person[] persons = new Person[4];
        for (int i=0;i<persons.length;i++){
            persons[i] = new Person();
        }
        for(Person person : persons){
            person.helloWorld();
        }
    }

   /* @Test
    public void demonstateBoolean() {
        int i = 3;
        int j = 4;
        boolean areEqual = i == j;

        if (i > j) {

        } else if (j > i) {

        } else if (areEqual) {
        } else {

        }
    }
*/
}