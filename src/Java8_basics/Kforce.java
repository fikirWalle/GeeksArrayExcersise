package Java8_basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Kforce {

    public static void main(String args[]){

        String answer=addKBeforeF("fluffy");
        System.out.println(answer);

    }
    public static String addKBeforeF(String input) {

        String[] strings = new String[]{"abD", "aB", "ABC", "cde", "cDd"};

       Collections.sort(Arrays.asList(strings),String::compareToIgnoreCase);
        System.out.println(Arrays.asList(strings));
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c == 'F' || c == 'f') {
                result.append('K').append(c);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
