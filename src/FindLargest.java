public class FindLargest {


    public static void main(String args[]){

        String answer=findLargest(2,9);
        System.out.print(answer);

    }

    public static String findLargest(int N, int S){
        // code here

        StringBuilder num=new StringBuilder();
        if(S==0 && N>1 || S>9*N)
            return new String("-1");
        for(int i=0;i<N;i++){
            if(S<=9){
                num.append(S);
                S=0;
            }
            else{
                num.append("9");
                S-=9;
            }
        }
        if(S==0)
            return num.toString();
        else
            return new String("-1");


        }
    }

