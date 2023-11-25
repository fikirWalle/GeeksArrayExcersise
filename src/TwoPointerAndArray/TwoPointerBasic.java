package TwoPointerAndArray;

import java.util.Arrays;

public class TwoPointerBasic {

    public static void main(String args[]){

      int[]A={ 2, 3, 5, 8, 9, 10, 11 };
        int answer=isPairSum(A,7,17);
        System.out.print(answer);
    }
    private static int isPairSum(int A[], int N, int X)
    {

        Arrays.sort(A);
        int left=0;
        int right= N-1;

        while(left<right){

            if(A[left]+A[right]==X){

                return 1;
            }
            else if(A[left]+A[right]>X){

                right--;
            }

            else{

                left++;
            }
        }
        return 0;
    }
}
