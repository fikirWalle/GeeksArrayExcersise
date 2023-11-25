package Java8_basics;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class EasyExcersise {


    public static void main(String args[]) {

        BiFunction<Integer, Integer, Integer> result = (a, b) -> {
            return a + b;
        };
        System.out.println(result.apply(8, 9));

        //Counting Empty String

        List<String>lists= Arrays.asList("Fikir","Abebe","","Kebe","");
        long answer= lists.stream().filter((s)->s.isEmpty()).count();
        System.out.println(answer);


        long answe2=lists.stream().filter((s)->s.length()>3).count();
        System.out.println(answe2);

          long findStrin= lists.stream().filter((s)->s.startsWith("A")).count();
        System.out.println(findStrin);

        // remove empity String from the list

        List<String>removes=lists.stream().filter((s)->!s.isEmpty()).collect(Collectors.toList());
        System.out.println(removes);


        

    }


}