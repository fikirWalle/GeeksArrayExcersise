package TwoPointerAndArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionsOfTwoArray {

    public static void main(String args[]){

        int []a={1, 2, 3, 4, 5, 6};
        int []b={3, 4, 5, 6, 7} ;
        int ans=NumberofElementsInIntersection(a,b,6,5);
        System.out.println(ans);

    }

    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here

        HashSet<Integer> elemnts= new HashSet<>();
        int intersection=0;

        for(int i=0;i<n;i++){

            elemnts.add(a[i]);
        }
        for(int j=0;j<m;j++){
            if(elemnts.contains(b[j])){

                intersection++;
                elemnts.remove(b[j]);
            }

        }
        Arrays.sort(a);

        return intersection;
    }
}
