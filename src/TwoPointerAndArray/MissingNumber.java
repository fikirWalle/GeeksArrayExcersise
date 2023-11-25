package TwoPointerAndArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumber {


public static void main(String args[]){

    int[]arr={6,1,2,8,3,4,7,10,5};

    int answer=missingNumber(arr,10);
    System.out.print(answer);
}


   public static int missingNumber(int array[], int n) {
        // Your Code Here



           // Using the Stream API to modify the elements
     //  List<Integer> output = IntStream.of(array).boxed().collect(Collectors.toList());
       int sum=n*(n+1)/2;
       int total=0;

       for(int i=0;i<array.length;i++){

        total+= array[i];

       }
       return sum-total;
    }
}
