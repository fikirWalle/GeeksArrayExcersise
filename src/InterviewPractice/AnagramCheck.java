package InterviewPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class AnagramCheck {


public static void main(String[] args){
   // boolean answer=isAnagram("love","vola");
   // System.out.println(answer);
   // removeOuterMostParentesis("(()()(()())") ;


       int arr[]=twosum(new int[]{2,7,11,5},9);
    System.out.println(Arrays.toString(arr));

    String x="abc";
    String y="abc";
    x=x.concat(y);
    System.out.println(x);


}

    public static boolean isAnagram(String s1 , String s2){


         if(s1.length()!=s2.length())return false;

         char[]s1Char=s1.toLowerCase().toCharArray();
         char[]s2char2=s2.toLowerCase().toCharArray();

        Arrays.sort(s1Char);
        Arrays.sort(s2char2);

        for(int i=0;i<s1Char.length;i++){
            if(s1Char[i]!=s2char2[i]) return false;
        }
                return true;
    }

    public static  void removeOuterMostParentesis(String s1){

        Stack<Character>stack= new Stack<>();

        for(int i=0;i< s1.length()-2;i++){
            int j=i+1;

            if(s1.charAt(i)=='('&&s1.charAt(j)==')'){
                stack.push(s1.charAt(i));
                stack.push(s1.charAt(j));
            }


        }
        System.out.print(stack);

    }

    public static int[]twosum(int nums[], int target){

        Map<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++){

           // int num=nums[i];
            int difference=target-nums[i];

            if(map.containsKey(difference)){
                return new int[] {map.get(difference),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
