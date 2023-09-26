package StackImplemnttion;

import java.util.Stack;

public class longestValidParentsis {



    public static void main(String args[]){

        int answer= findMaxLen("()(())(");
        System.out.print(answer);


    }

    static int findMaxLen(String S) {
        // code here

        Stack<Character>stack= new Stack<>();
        int countLen=0;

        for(char ch:S.toCharArray()){

            if(ch=='('){
                stack.push(ch);
            } else if (!stack.isEmpty()) {
                if(ch==')'){
                    stack.pop();
                    countLen+=2;
                }

            }
        }
        return countLen;
    }
}
