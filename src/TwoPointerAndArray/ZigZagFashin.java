package TwoPointerAndArray;

import java.util.Arrays;

public class ZigZagFashin {

public static void main(String args[]){

    int []arr={4, 3, 7, 8, 6, 2, 1};
    zigZag(arr,7);

    System.out.println(Arrays.toString(arr));

}

    public static void zigZag(int a[], int n) {
        // Code your solution here.
        int temp=0;
        for(int i = 0; i < n-1 ; i++)
        {
           if(i%2==0){
               if(a[i]>a[i+1]){
                   temp=a[i];
                   a[i]=a[i+1];
                   a[i+1]=temp;

               }

           } else if (i%2!=0) {
               if(a[i]<a[i+1]){
                   temp=a[i];
                   a[i]=a[i+1];
                   a[i+1]=temp;
               }

           }
        }
            }


        }




