import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicatesInArray {

    public static void main(String args[]){

        int[]a={2,3,1,2,3};

        ArrayList<Integer>lists= duplicates(a,5);
        System.out.print(lists);
    }
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here

        Arrays.sort(arr);
        ArrayList<Integer>answers= new ArrayList<>();

        for(int i=0;i<n-1;i++){

            if(arr[i]==arr[i+1]){

                if(!answers.contains(arr[i+1])){
                    answers.add(arr[i+1]);
                }
            }
        }
        if(answers.size()==0){

            answers.add(-1);
        }

        return answers;
    }
}
