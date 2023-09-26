package StackImplemnttion;

import java.util.ArrayList;
import java.util.Stack;

public class DeleteElemnt {


  public static void main (String args[]){

ArrayList<Integer>answer=deleteElement(new int[]{12, 7, 11, 5, 20, 15, 15, 7, 10},9,5);
System.out.print(answer);

  }
    public static ArrayList<Integer> deleteElement (int arr[], int n, int k) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && k > 0 && stack.peek() < arr[i]) {
                stack.pop();
                k--;
            }
            stack.push(arr[i]);
        }

        // If there are still elements to be deleted, remove them from the end of the stack
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // Create an ArrayList from the stack
        ArrayList<Integer> result = new ArrayList<>(stack);
        return result;
    }
    }

