package TwoPointerAndArray;

public class removeDuplicates {

public static void main(String args[]){


    int []answers={1,2,2,4};
    int ans=remove_duplicate(answers,4);
    System.out.println(ans);
}

    public static int remove_duplicate(int A[],int N){
        // code here

        if(N==0) return 0;

        int uniqueElement=1;
        for(int i=1;i<N;i++){

            if(A[i]!=A[i-1]){
                A[uniqueElement]=A[i];
                uniqueElement++;
            }
        }
        return uniqueElement;
    }
}
