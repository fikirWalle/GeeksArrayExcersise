package Binerysearch;

import java.util.Arrays;

public class FindPair {

    public static void main (String args[]){

        boolean answer=findPair(new int[]{-5, -2, 1, 3, 7},5,7);
        System.out.println(answer);

    }


    public static boolean findPair(int arr[], int size, int n)
    {
        //code here.

        Arrays.sort(arr);

        int left = 0;
        int right = 1; // Initialize right pointer to the second element

        while (right < size) {
            int diff = arr[right] - arr[left];

            if (diff == n) {
                return true;
            } else if (diff < n) {
                right++; // Increase the right pointer to try to increase the difference
            } else {
                left++;  // Increase the left pointer to try to decrease the difference
                if (left == right) {
                    right++; // Make sure right pointer is always ahead of left pointer
                }
            }
        }

        return false;
    }
}
