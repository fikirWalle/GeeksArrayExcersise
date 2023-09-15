import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SubarrayWithSum {

             public static void main(String args[]){
           int arr[]={1,2,3,4,5,6,7,8,9,10};

           ArrayList<Integer>arrays=subarraySum(arr,10,15);
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
