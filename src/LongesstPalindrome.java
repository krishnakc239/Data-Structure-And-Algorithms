import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LongesstPalindrome {

    public static void main(String[] args) {
        String r = longestPalindrome("babad");
        System.out.println(r);
    }

    public static String longestPalindrome(String s) {

        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            System.out.println(" len1 : "+ len1);
            int len2 = expandAroundCenter(s, i, i + 1);
            System.out.println(" len2 : "+ len2);

            int len = Math.max(len1, len2);

            if (len > end - start) {
                System.out.println(" maxLen  : "+ len +" > "+ end +" - "+ start +" : "+ (end-start));
                System.out.println("i :"+i);
                start = i - (len - 1) / 2;
                end = i + len / 2;
                System.out.println(" start : "+ start);
                System.out.println(" end : "+ end);
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        System.out.println(" L : "+L +", R : "+ R);
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            System.out.println("char L : "+s.charAt(L)+", "+ "char R :"+s.charAt(R));
            L--;
            R++;
        }
        System.out.println(" L : "+L +", R : "+ R);
        System.out.println(" return : "+ (R-L-1));
        return R - L - 1;
    }
}
