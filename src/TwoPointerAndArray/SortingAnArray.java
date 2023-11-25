package TwoPointerAndArray;

import java.util.Arrays;

public class SortingAnArray {

public static void main(String args[]){

    int[]a={0,2 ,1, 2 ,0};

          sort012(a,5);
}

    public static void sort012(int a[], int n)
    {
        // code here

        Arrays.sort(a);
        System.out.print(Arrays.toString(a));
    }

    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        //Your code here
        Arrays.sort(arr);
        int smallest=arr[k-1];
        return smallest;
    }
}
