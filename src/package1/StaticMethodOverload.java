package package1;

public class StaticMethodOverload {

    private static void add(int i, int j) {
        System.out.println("int version");
    }

    private static void add(Integer i, Integer j) {
        System.out.println("Integer version");
    }

    public static void main(String[] args) {
//        add(10, 20); //integer version
//        add(null, null); // Integer Version
//        add(new Integer(10), new Integer(10)); // Integer Version
//        add(new Integer(10), 10)); // compiler error ambigious mehtod to call
        add(new Integer(10), null); // Integer Version
    }
}
