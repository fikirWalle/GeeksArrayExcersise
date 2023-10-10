package Binerysearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FirstAndLastOccerance {

    public static void main(String args[]){
        ArrayList<Integer>answer= firstAndLast(new int[]{ 1, 3, 3, 4 },4,3);

        System.out.println(answer);

    }

    public static ArrayList<Integer> firstAndLast(int arr[], int n, int x){


        ArrayList<Integer>list=new ArrayList<>();
        int i,j;

        for(i=0;i<n;i++){
            if(arr[i] == x){
                list.add(i);
                break;
            }

        }

        for(j=n-1;j>=0;j--){
            if(arr[j] == x){
                list.add(j);
                break;
            }

        }

        if(list.isEmpty())
            list.add(-1);

        return list;
    }
}
