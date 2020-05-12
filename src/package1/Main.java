package package1;

public class Main {

    static {
        System.out.println("static block");
    }
    public static synchronized final strictfp void main(String[] args) {
        int a = 10;
        System.out.println(a++);//10
        System.out.println(a);//11
    }
}
