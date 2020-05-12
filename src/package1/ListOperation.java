package package1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

interface I1 {
    void m1() throws java.io.IOException;
}

public class ListOperation implements I1 {

    @Override
    public void m1() throws FileNotFoundException {

    }
    public static void change(int num) {
        num++;
        System.out.println(num);
    }

    public static void main(String[] args) {
        int i1 = 1;
        change(i1);
        System.out.println(i1);
        System.out.println(5.6 < 7);

//    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
//        list.add(3,"B");// throws IndexOutOfBoundsException: Index: 3, Size: 1 because index 1 and 2 is empty and it can not skip them
//        list.add("A");
//        list.add(new String("A"));
//        list.add(new String("A"));
//
//        System.out.println(list.get(0) == list.get(2));
//        System.out.println(list.get(2) == list.get(3)); //false
        LocalDate d1 = LocalDate.parse("2012-01-01",DateTimeFormatter.ISO_DATE);
        LocalDate d2 = LocalDate.parse("2012-01-01",DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(d1 +" ,"+ d2);
        System.out.println(d1.equals(d2));
        System.out.println(d1.isEqual(d2));
//        System.out.println(LocalDate.of(2012,01,-1));// throws exception
//        String str = null;
//            System.out.println(str.isEmpty());
//            Number n = 8;
//        System.out.println(n);

//        List<String> list = new ArrayList<>();
//        list.add(null);
//        list.add(null);
//        list.add(null);
//        list.add(null);
//
//        System.out.println(list);
//        System.out.println(list.size());
//        short a = 4;
//        char c = (char)a;
//        short s = (short)c;
//        StringBuilder sb = new StringBuilder("Java");
//        String s1 = sb.toString();
//        String s2 = "Java";
//
//        System.out.println(s1.equals(s2));

//        Period period = Period.of(2, 1, 0).ofYears(-10);
//        System.out.println(period);


//        add(10.0, null);


//        Boolean b1 = new Boolean("true");
//        Boolean b2 = new Boolean("True");
//        Boolean b3 = new Boolean("abc");
//        Boolean b4 = null;
//        System.out.println(b1+", "+ b2+", "+ b3+ ", "+b4+ " : "+ ( b1 == b2));

//        float d = 7;
//        switch (d){ compiller error
//            case 8 :
//            System.out.println("hello");
//        }

//        StringBuilder s = new StringBuilder("hello there");
//        String s = new String("hello");
//        System.out.println(s.substring(0,20));
//        s.delete(0,1);
//        System.out.println(s);

//        display(1);

//        int a =2;
//        boolean result = a++ == 2 || a-- == 2;
//        System.out.println(a++ == 2);
//        System.out.println(--a == 2);
//        System.out.println(result);
//
//    }
//    private static void add(double d1, double d2) {
//        System.out.println("double version: " + (d1 + d2));
//    }
//
//    private static void add(Double d1, Double d2) {
//        System.out.println("Double version: " + (d1 + d2));
//    }


    }

    static void display(Number n){

        System.out.println("number :"+ n);
        if(new Boolean("tru1e")){
            System.out.println(" trueeeeeeeeeeee");

        }
    }
    static void displayObject(Object n){
        System.out.println("object : "+ n);

    }
}

class A{}
class B extends A{
    public static void main(String[] args) {

        int var = '7';
        switch(var) {
            case '7':
                System.out.println("Lucky no. 7");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }
}
