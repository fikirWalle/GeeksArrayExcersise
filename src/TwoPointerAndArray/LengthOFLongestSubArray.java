package TwoPointerAndArray;

public class LengthOFLongestSubArray {

public static void main(String args[]){


    long []arr={2, 3, 4, -1, -2, 1, 5, 6, 3};

    long answer=longestSubarry(arr,9);

  System.out.print(answer);
}



    public static long longestSubarry(long A[], int N)
    {

        int maxLength = 0;
        int currentLength = 0;

        for (int i = 0; i < N; i++) {
            if (A[i] >= 0) {
                currentLength++;
            } else {
                currentLength = 0;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        return maxLength;
    }
}
