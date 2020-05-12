package package2;



class  Parent{
    public Parent(){}

    public void m1(){
        System.out.println("parent");

    }
}
public class Child {
    String name;
    public Child(){
    }
    public void m1(){
        System.out.println("child");
    }
    public void m2(){
        System.out.println("child1");
    }

    public static void main(String[] args) {

        System.out.println(~-1);
        String s = null;
        System.out.println("printing null");
        System.out.println(s);
//        double d = 0x1.fffffffffffffp1023;
//        double d1= 31.415926E-1;
//        double d2= 31.415926E1;
//        System.out.println(" double hex value :"+ d);
//        System.out.println(" double exp value :"+ d1);
//        System.out.println(" double exp1 value :"+ d2);
        Integer i = 1013__3432;
        Integer i1 = new Integer(10);
        int i3 = 1013__3432;
        System.out.println(i == i1);//false
        System.out.println(i == i3);//true
        System.out.println(i.equals(i1));//true
        char c = 12_345;
        System.out.println(c);

        int bin0 = 0101010101;//octal num
        System.out.println(bin0);
        int bin = 0b101010101;
        System.out.println(bin);//343

        System.out.println("..................type casting.........");
        byte b = 'a';
        System.out.println(b);
        int[][] arr = new int[2][];
//        arr[1][0] = 3;// nullpointer exception as second array sixe is not defined
//        System.out.println(arr[1][0]);
//        int[] array= new int[2];
//        array[0]=10;
//        array[1]=20;
//        System.out.println(array[0]+", "+ array[1]);
//        Child c = new Child();
//        c.m1();
//        ((Child) p).m2();
//        Parent p  = new Child();
//        Child c = (Child)p;
//        c.m1();
//        c.m2();
//        p.m1();
//        ((Child) p).m2();
//        Parent p1 = new Parent();
//        Child c1 =(Child) p1;

//        String s = new String("a");
//        StringBuilder sb = new StringBuilder("a");
//        StringBuilder sb1 = new StringBuilder("a");
//        System.out.println(s == sb);
//        System.out.println(sb.equals(sb1));

    }
}
