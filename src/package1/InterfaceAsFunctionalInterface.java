package package1;

interface Interf{
    public int square(int n);
}
public class InterfaceAsFunctionalInterface {
    static Interf i = (int n) -> { return n*n;};

     static public void main(String[] args) {

        System.out.println(i.square(2));

        StringBuilder s1 = new StringBuilder("a");
        System.out.println("a".equals(s1));
    }
}
