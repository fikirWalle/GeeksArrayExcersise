package Java8_basics;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TestExam {

    public static void main(String args[]){

        System.out.println(Stream.of("green","yellow","blue").max((s1,s2)->s1.compareTo(s2)).filter(s->s.endsWith("n")).orElse("yellow"));
        Double D=null;
        System.out.println((D instanceof Double)?"True": "False");
        String e="1";
        System.out.println(("1"!=e)?"True":"false");

        boolean b=false;
        System.out.println((b=true)?"true":"false");
   Runnable r=()-> System.out.println("HI");
      new Thread(r).start();
        Supplier<String>i=()->"Car";
        Consumer<String>c=x-> System.out.println(x.toLowerCase());
        Consumer<String>d=x-> System.out.println(x.toUpperCase());
        c.andThen(d).accept(i.get());
        System.out.println();

        LocalDate local= LocalDate.of(2015,4,4);
        System.out.println(local.format(DateTimeFormatter.ofPattern("MMM dd, YYYY")));
        System.out.println(local.format(DateTimeFormatter.ofPattern("E, MMM dd, YYYY")));
        System.out.println(local.format(DateTimeFormatter.ofPattern("MM/dd/YY")));

        List<String>list= Arrays.asList("dog","over","Good");
        System.out.println(list.stream().reduce(new String(),(x1,x2)->{if (x1.equals("dog"))return x1;return x2;}));
        System.out.println(list.stream().reduce(new String(),(s1,s2)->s1+s2.charAt(0),(c1,c2)->c1+=c2));
        list.stream().reduce((x1,x2)->x1.length()>x2.length()?x1:x2).ifPresent(System.out::println);
        list.stream().reduce((x1,x2)->x1.length()==3?x1:x2).ifPresent(System.out::println);




        Integer x=3;
        Integer y=null;
        try{
            System.out.println(Integer.compareUnsigned(x,3)==0||Integer.compareUnsigned(y,0)==0);

        }
        catch(Exception ex){
            System.out.println(ex.getClass().toString());


        }
        try{
            System.out.println(y.compareTo(null)==0||true);
        }

        catch (Exception ex){
            System.out.println(ex.getClass().toString());
        }
    }
}
