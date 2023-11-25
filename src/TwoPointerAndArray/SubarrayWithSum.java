package TwoPointerAndArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SubarrayWithSum {

             public static void main(String args[]){
           int arr[]={1,2,3,7,5};

           ArrayList<Integer>arrays=subarraySum2(arr,5,12);
           System.out.println(arrays);

             }
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here

           ArrayList<Integer>sumsIndex=new ArrayList<>();

           int sum=0;
           int start=0;
           int flag=0;
           if(s==0) {
               sumsIndex.add(-1);
               return sumsIndex;
           }

           for(int i=0;i<n;i++){

               sum+=arr[i];

               while(sum>s){

                   sum=sum-arr[start];
                   System.out.println(sum);
                   start++;
               }
               if(sum==s){
                   start=start+1;
                   i=i+1;
                   sumsIndex.add(start);
                   sumsIndex.add(i);
                   flag=1;
                   break;
               }



           }
        if(flag==0){

            sumsIndex.add(-1);
        }

          return sumsIndex;
            }


    static ArrayList<Integer> subarraySum2(int[] arr, int n, int s) {
        ArrayList<Integer>sumsIndex=new ArrayList<>();
       int flag=0;
       int sum=0;
       int start=0;

       for(int i=0;i<n;i++){

           sum+=arr[i];
           while(sum>s){

               sum=sum-arr[start];
               start++;
           }
           if(sum==s){
              start=start+1;
              i=i+1;
              sumsIndex.add(start);
              sumsIndex.add(i);
              flag=1;
              break;

           }
       }
       if(flag==0){
           sumsIndex.add(-1);

       }
       return sumsIndex;
    }


}
