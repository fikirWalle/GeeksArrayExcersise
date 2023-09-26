package StackImplemnttion;

import java.util.Stack;
import java.util.Vector;

public class StringManipulation {

    public static void main(String args[]){

        Vector<String>v=new Vector<>();

        v.add("tom");
        v.add("jerry");
        v.add("jerry");
        v.add("tom");

        int answer=removeConsecutiveSame(v);
        System.out.println(answer);
    }


    static int removeConsecutiveSame(Vector<String > v)
    {
        // Your code goes here

        Stack<String>stack=new Stack<>();

        for(String s:v){


           if(!stack.isEmpty()&& stack.peek().equals(s)){

               stack.pop();
           }
           else{
               stack.push(s);
           }



        }
        return stack.size();
    }
}
