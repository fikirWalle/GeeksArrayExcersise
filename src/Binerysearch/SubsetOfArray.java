package Binerysearch;

import java.util.Arrays;

public class SubsetOfArray {

    public static void main(String args[]) {


        String answer = isSubset(new long[]{1, 2, 3, 4, 4, 5, 6},new long[]{1, 2, 4},6,3);

        System.out.print(answer);
    }


    public static String isSubset( long a1[], long a2[], long n, long m) {


        Arrays.sort(a1);
        Arrays.sort(a2);

        int i = 0; // Index for a1
        int j = 0; // Index for a2

        while (i < n && j < m) {
            if (a1[i] == a2[j]) {
                i++;
                j++;
            } else if (a1[i] < a2[j]) {
                i++;
            } else {
                return "No"; // If a1[i] > a2[j], a2 is not a subset of a1
            }
        }

        // If all elements of a2 are found in a1
        if (j == m) {
            return "Yes";
        } else {
            return "No";
        }
    }


    }
