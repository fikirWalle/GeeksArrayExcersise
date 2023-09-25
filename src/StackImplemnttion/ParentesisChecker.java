package StackImplemnttion;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ParentesisChecker {

    public static void main(String args[]){

        boolean answer=ispar("{([])}");
        System.out.println(answer);
    }

    static boolean ispar(String x)
    {
        // add your code here

        Stack<Character>stack= new Stack<>();

        for(char ch:x.toCharArray()) {

            if (ch == '{' || ch == '(' || ch == '[') {

                stack.push(ch);
            } else if (ch == '}' || ch == ')' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if (top == '{' && ch != '}' || top == '(' && ch != ')' || top == '[' && ch != ']') return false;
            }
        }
        return stack.isEmpty();
    }
}
