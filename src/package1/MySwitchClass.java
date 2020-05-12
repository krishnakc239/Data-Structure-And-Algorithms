package package1;

public class MySwitchClass {
    public static void main(String[] args) {
//        byte b = 10;
//        switch(b+1)
//        {
//            case 10: System.out.print(10);
//            case 100: System.out.print(100);
//            case 1000: System.out.print(1000);
//            default:
//                System.out.println(" default");
//        }

//        String a = "a";
//        switch (a){
//            case "c":
//                System.out.println("a");
//            case "b":
//                System.out.println("b");
////            default:
////                System.out.println("default");
//        }

        String fruit = "mango";
        switch (fruit) {

            case "Apple":
                System.out.println("APPLE");

            case "mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
            default:
                System.out.println("ANY FRUIT WILL DO");


        }

        System.out.println(" switc..........");
        byte b = 0;
        switch (b+2000){
            case 2:
                System.out.println(2);
            case 2000:
                System.out.println(2000);
            default:
                System.out.println("default");
        }
    }
}
