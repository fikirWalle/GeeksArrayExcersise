package StackImplemnttion;

import java.util.Stack;

public class ImediateSmaller {

public static void main(String args[]){
    int []arr={4,2,1,5,3};
 immediateSmaller(arr,5);

}

    public static void  immediateSmaller(int arr[], int n) {
        // code here

        Stack<Integer>stack= new Stack<>();
        //int i=0;
        int j=1;
        for(int i=0;i<n&&j<n-1;i++){
           j=i+1;
            if(arr[j]>arr[i]){
                stack.push(-1);
            }
            else if(arr[j]<arr[i]){
                stack.push(arr[j]);
            }
           if(j==n-1){
               stack.push(-1);

           }

        }
        System.out.println(stack);
    }
}
