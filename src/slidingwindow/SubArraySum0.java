package slidingwindow;

import java.util.Arrays;

public class SubArraySum0 {

public static void main(String args[]){
    boolean answer=findsum(new int[]{4 ,5 ,-4 ,-2 ,1},5);
    String str1 = "InterviewBit";
    String str2 = "InterviewBit";

    System.out.println(str1 == str2);

    //System.out.print(answer);
    String str11 = new String("InterviewBit");
    String str22 = "InterviewBit";

    System.out.println(str11 == str22);
    try{

        int x=1;
        int a=x/0;
    }

    catch(ArrayIndexOutOfBoundsException exception){
        System.out.print(exception);

    }catch(ArithmeticException exception){
        System.out.print(exception);

    }


}

    public static boolean findsum(int arr[],int n)
    {
        //Your code here

        Arrays.sort(arr);
        if(n>0&&arr[0]>=1){
            return false;
        }
        int sum=0;
        for(int i=0;i<n;i++){

           sum+=arr[i];
           if(sum==0) return true;
        }
return false;

    }


}
