public class GCD {


    public static void main(String[] args) {
        int gcd = findGCD(30,50);
        System.out.println(gcd);
    }

    public static int findGCD(int n1, int n2){
        if(n2 == 0){
            return  n1;
        }
        System.out.println("n1 : "+ n1 +", n2: "+ (n1%n2));
        return findGCD(n2, n1%n2);
    }
}
