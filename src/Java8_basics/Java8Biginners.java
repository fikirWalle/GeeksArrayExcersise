package Java8_basics;

public class Java8Biginners {

public static void main(String args[]){


    Java8Biginners j= new Java8Biginners();
    MathOperations addition= (int a, int b)->a+b;
    MathOperations subtraction=(a,b)->a-b;
    MathOperations division= (a,b)->a/b;

    MathOperations multiplication=(a,b)->a*b;
    System.out.println(j.operate(10,5,addition));
    System.out.println(j.operate(3,9,division));
    System.out.println(j.operate(4,5,subtraction));
    System.out.println(j.operate(6,8,multiplication));

    Greeting greet=(message)-> System.out.println("Goodmorning"+message);
    greet.greet("Fikir");
}

    interface MathOperations {

        int operation(int a,int b);
    }

    interface Greeting{

    void greet(String s);
    }

    private int operate(int a, int b, MathOperations mathOperation) {
        return mathOperation.operation(a,b);
    }

}
