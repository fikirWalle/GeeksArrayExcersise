package Java8_basics;

import java.util.HashMap;

public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public static void main(String args[]){
        HashMap<Person,String>maps=new HashMap<>();
        Person p1= new Person("hhh","bb");
        Person p2= new Person("hhh","bb");
        maps.put(p1,"person1");
        System.out.println(maps.get(p1));


    }
}
