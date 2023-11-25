package TwoPointerAndArray;

import java.util.ArrayList;

public class LeaderOfTheArray {

       public static void main(String args[]){

           int[]arr={16,17,4,3,5,2};
           ArrayList<Integer>answers=leaders(arr,6);
           System.out.print(answers);
       }
    public static ArrayList<Integer> leaders(int arr[], int n){


        // Your code here
        if(n==0) return new ArrayList<>();


        ArrayList<Integer>answers= new ArrayList<>();
        int s=0;
        for(int i=s+1;i<n;){
            if(arr[i]>arr[s])
                s++;
            else if(i==n-1 && arr[i]<arr[s]){
                answers.add(arr[s]);
                s++;
                i=s+1;
            }
            else
                i++;
        }
        answers.add(arr[n-1]);
        return answers;
    }
}
