package TwoPointerAndArray;

public class FourElemnts {

    public static boolean   find4Numbers(int A[], int n, int X)
    {
  int sum=0;
  int count;
          for(int i=0;i<n;i++){

              sum+=A[i];
              if(sum==X) return true;
          }
          return false;
    }
}
