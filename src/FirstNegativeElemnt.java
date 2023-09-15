import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class FirstNegativeElemnt {



    public static void main(String args[]){


        long []answers={-8, 2, 3, -6, 10};
        long ans[]=printFirstNegativeInteger(answers,5,2);
        System.out.println(Arrays.toString(ans));
    }


    public static long[] printFirstNegativeInteger(long A[], int N, int K)
    {

        long[] result = new long[N - K + 1]; // Result array to store the first negative integers

        Deque<Integer> deque = new ArrayDeque<>();

        // Process the first window
        int i;
        for (i = 0; i < K; i++) {
            if (A[i] < 0) {
                deque.add(i);
            }
        }

        int resultIndex = 0;

        // Process the remaining windows
        for (; i < N; i++) {
            // If the deque is not empty, the front element contains the first negative integer
            if (!deque.isEmpty()) {
                result[resultIndex++] = A[deque.peek()];
            } else {
                result[resultIndex++] = 0;
            }

            // Remove elements that are out of the current window
            while (!deque.isEmpty() && deque.peek() <= i - K) {
                deque.poll();
            }

            // Add the current element to the deque if it's negative
            if (A[i] < 0) {
                deque.add(i);
            }
        }

        // Handle the last window
        if (!deque.isEmpty()) {
            result[resultIndex] = A[deque.peek()];
        } else {
            result[resultIndex] = 0;
        }

        return result;
    }
    }

