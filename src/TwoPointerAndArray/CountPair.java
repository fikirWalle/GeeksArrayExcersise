package TwoPointerAndArray;

public class CountPair {

    public static void main(String args[]){

        int arr[] =  {1, 2, 3, 4, 5, 6, 7};

        int answer=Countpair(arr,7,98);
        System.out.print(answer);
    }

  public static  int  Countpair(int a[], int n, int sum)
    {
        // Complete the function

        int count=0;
      int left=0;
      int right=n-1;

      while(left<right){

          if(a[left]+a[right]==sum){

              count++;
          }
          if(a[left]+a[right]>sum){

              right--;
          }
          else{
              left++;
          }
      }
      if(count==0) return -1;


      return count;



    }
}
