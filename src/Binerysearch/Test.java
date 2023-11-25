package Binerysearch;

public class Test {

    int x=50;
   public Test (){


   }

    public Test(int x) {
        this.x = x;
    }

    public void hello(){
       System.out.println("Hello");
    }
}
class B extends Test{


   B(){
       super();
       System.out.print(super.x);
   }
  public static void main(String args[]){

  }
}