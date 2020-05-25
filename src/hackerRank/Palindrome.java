package hackerRank;

public class Palindrome {

    public  int countPalindrome(String s){
        String newStr2="";
        StringBuilder sb= new StringBuilder();
        StringBuilder sb2= new StringBuilder();
        int countPisPal= s.length();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+2; j <=s.length() ; j++) {
                sb=  new StringBuilder(s.substring(i,j));
                sb2 = sb;
                if(sb.toString().equals(sb2.reverse().toString())){
                    countPisPal++;
                    System.out.println(" ==s1 " + sb  + "-" + sb2);
                }
//                countPisPal+= isPisPal(s.substring(i,j));
            }
        }
        return   countPisPal;
    }
    private int isPisPal(String s2 ){

        for (int i = 0; i < s2.length()/2; i++) {
              if(s2.charAt(i)!= s2.charAt(s2.length()-1-i)){
                  return 0;
              }
        }
        return  1;
    }

    public static void main(String[] args) {
        String p="aaa"; //"abccba";//"aaa"; //"daata";

  p ="daata";
        Palindrome palindrome= new Palindrome();

        System.out.println(" total Plaindem Count= " + palindrome.countPalindrome(p));


//        System.out.println(" total Plaindem Count= " +  p.substring(3, 6));

    }
}
