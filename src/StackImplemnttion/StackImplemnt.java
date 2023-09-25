package StackImplemnttion;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackImplemnt {

    public static void main (String args[]){
        Stack<Integer>stack= new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.print(stack.peek());
        System.out.println(stack);
        for(int i=0;i<stack.size();i++){
            System.out.println(stack);

        }
String answer= reverseStringUsingStack("Fikir");

        System.out.println(answer);


    }

    public static String reverseStringUsingStack(String s){


        //recommended way of stack is Deque
        Deque<Character>stack= new ArrayDeque<>();

        for(char c:s.toCharArray()){

            stack.push(c);
        }

        StringBuilder reverse= new StringBuilder();

        while(!stack.isEmpty()){
            reverse.append(stack.pop());

        }
        return reverse.toString();
    }


}
