package Binerysearch;

public class FindTheClosetNumber {

    public static void main(String args[]){

        int answer=findClosest(new int[]{1, 3, 6, 7},4,4);
        System.out.print(answer);

    }


    public static int findClosest(int arr[], int n, int target)
    {
        // Complete the function

        int dif=Integer.MAX_VALUE;

        int num=arr[0];

        for(int i=0;i<n;i++){

            int currentDiff= Math.abs(arr[i]-target);
            if(currentDiff<dif){
                dif=currentDiff;
                num=arr[i];
            } else if (currentDiff==dif) {{

                num=arr[i];
            }

            }
        }
        return num;
    }
}
