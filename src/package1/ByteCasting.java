package package1;

public class ByteCasting {
    /**  range is -128 to 127*/
    public static void main(String[] args) {
        byte b1 = (byte) (127 + 1); // -128
        byte b2 = (byte) (127 + 2);// -127
        byte b3 = (byte) (-128 - 1);// 127
        byte b4 = (byte) (-128 - 2);// 126
        System.out.println(b4);
    }
}
