package Binerysearch;

import java.util.ArrayList;
import java.util.List;

public class FindThePeakElemnt {

    public static void main(String args[]){

          ArrayList<Integer>array= new ArrayList<>();
          array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

 int answer=findPeakElement(array);
 System.out.println(answer);
    }

    public static int findPeakElement(List<Integer> a)
    {
        // Code here

        int mid=0+(a.size()-0)/2;
        int high=Integer.MIN_VALUE;


        if(a.get(mid)>a.get(mid-1)&&a.get(mid)>a.get(mid+1)){ return a.get(mid);}

        if(mid!=0){

            if(a.get(mid)>a.get(mid-1)){
                while(mid<a.size()){

                    if(a.get(mid)>high){
                        high=a.get(mid);
                    }
                    mid++;
                }

            }

        }
        else {

            high=a.get(mid);
        }
             return high;
    }
}
