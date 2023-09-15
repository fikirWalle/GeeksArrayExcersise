import java.util.Arrays;
import java.util.HashMap;

public class CountTriplet {

public static void main(String args[]){

    int []answers={1, 5, 3, 2};
    int ans=countTriplet(answers,4);
    System.out.println(ans);

}


    public static int countTriplet(int arr[], int n) {
        // code here

      int countTriplet=0;
        Arrays.sort(arr);

        for(int i=n-1;i>=0;i--){

            int j=0;
            int k=i-1;
            while(j<k){

                if(arr[j]+arr[k]==arr[i]){

                    countTriplet++;
                    j++;
                    k--;
                } else if (arr[j]+arr[k]<arr[i]) {

                    j++;


                }
                else{
                    k--;
                }
            }
        }

        return countTriplet;
    }
}
