public class LongestCommonSubstring {


    public static void main(String[] args) {

    }

    public static String longestCommonSubstring(String s1, String s2){


        return "";
    }

    public static int lcsSubstr(String s1, String s2, int m, int n){

        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return 1+ lcsSubstr(s1,s2,m-1,n-1);
        }else{
            return Integer.max(lcsSubstr(s1,s2,m-1,n), lcsSubstr(s1,s2,m,n-1));
        }

    }
}
