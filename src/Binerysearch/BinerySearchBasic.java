package Binerysearch;

public class BinerySearchBasic {

    public static void main(String args[]) {


        int answer = binarysearch(new int[]{1, 2, 3, 4, 5}, 5, 433);

        System.out.print(answer);
    }


    public static int binarysearch(int arr[], int n, int k) {
        // code here

        int low = 0;
        int high = n-1;
        int mid = -1;

        while (low <= high) {


            mid = low+(high-low) / 2;

            if (arr[mid] == k) {
                return mid;


            } else if (arr[mid] > k) {

                high = mid-1;
            } else {

                low =mid+1;

            }


        }
        return -1;
    }
}
