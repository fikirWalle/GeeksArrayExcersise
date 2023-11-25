package TwoPointerAndArray;

public class ClosesetSumInSortedArray {

    public static void main(String args[]){


        int arr[] = {1, 3, 4, 7, 10}; int x = 15;

        printClosest(arr,5,x);

    }

    public static void printClosest(int[] arr, int n, int x)
    {


        int left=0;
        int right=n-1;
        int l_index=0;
        int r_index=n-1;
        int diff=Integer.MAX_VALUE;

        while(left<right){

              int currentDif=Math.abs(arr[left]+arr[right]-x);
              System.out.println(currentDif);
            if(currentDif<diff){
                diff=currentDif;
                l_index=left;
                r_index=right;
            }

      if(arr[left]+arr[right]>x){

          right--;
      }
      else{

          left++;
      }
        }

        System.out.print("the closest arry pair is"+"["+arr[l_index]+" "+arr[r_index]+"]");
    }
}
