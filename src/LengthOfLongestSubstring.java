import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int maxCount =0;
        int a_pointer =0;
        int b_pointer =0;
        Set<Character> set = new HashSet<>();
        while(b_pointer < s.length()){

            if(!set.contains(s.charAt(b_pointer))){
                set.add(s.charAt(b_pointer));
                b_pointer++;
                maxCount = Math.max(set.size(), maxCount);
            }else{
                set.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return maxCount;
    }
}
