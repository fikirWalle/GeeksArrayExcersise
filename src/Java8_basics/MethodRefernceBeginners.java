package Java8_basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MethodRefernceBeginners {

    public static void main(String args[]){

      Greetings typeGreet=(mesaage)-> System.out.println("Hello "+mesaage);
      Greetings type2=(message -> System.out.println("Hello"+ message));

      typeGreet.typeofGreet("Good Morning");
      typeGreet.typeofGreet("Good Afternoon");

    }


}
 interface Greetings{

    void typeofGreet(String message);
}


