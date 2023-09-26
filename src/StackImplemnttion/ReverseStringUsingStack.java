package StackImplemnttion;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseStringUsingStack {


    public static void main (String args[]){

    String answer= reverse("Fikir");
    System.out.print(answer);

    }

    public static String reverse(String S){
        //code here
        Stack<Character>stack= new Stack<>();

        StringBuilder sb= new StringBuilder();
        for(int i=S.length()-1;i>=0;i--){

            stack.push(S.charAt(i));
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
