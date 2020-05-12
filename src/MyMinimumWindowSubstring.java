import java.util.HashMap;
import java.util.Map;

public class MyMinimumWindowSubstring {
    /**
     * 1. Use two pointers: start and end to represent a window.
     * 2. Move end to find a valid window.
     * 3. When a valid window is found, move start to find a smaller window.
     * To check if a window is valid, we use a map to store (char, count) for chars in t.
     * And use counter for the number of chars of t to be found in s.
     * The key part is m[s[end]]--;. We decrease count for each char in s.
     * If it does not exist in t, the count will be negative.
     */

    public static void main(String[] args) {
        System.out.println("min window : " + minWindow("adbebaca", "aba"));
    }

    public static String minWindow(String s, String t) {

        if(t.length()> s.length()) return " t longer than s ";
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println("initial map :"+ map +", counter : "+ map.size());

        int counter = map.size();

        int begin = 0, end = 0;
        int minStart = 0;
        int len = Integer.MAX_VALUE;


        while(end < s.length()){
            System.out.println("outer while loop ........................");
            char cend = s.charAt(end);
            if( map.containsKey(cend) ){
                map.put(cend, map.get(cend)-1);
                System.out.println("    map after containing "+ cend +" : "+ map);
                System.out.println("    map.get("+ cend + ") = "+ map.get(cend));
                if(map.get(cend) == 0){
                    counter--;
                    System.out.println("    counter reduced to : "+ counter);
                }
            }
            end++;
            System.out.println("    end in outer loop : "+ end);
            while(counter == 0){
                System.out.println("  inner while loop.................");
                System.out.println("    window found : "+ s.substring(begin,end));
                char cbegin = s.charAt(begin);
                if(map.containsKey(cbegin)){
                    map.put(cbegin, map.get(cbegin) + 1);
                    System.out.println("    map after containing "+ cbegin + ": "+ map);
                    if(map.get(cbegin) > 0){
                        counter++;
                        System.out.println("    since map contains "+ cbegin +" so conter increased to : "+ counter);
                    }
                }
                System.out.println("    end: "+ end +" - begin: "+ begin +" = "+ (end-begin) +" , len : "+ len);
                if(end-begin < len){
                    minStart = begin;
                    len = end -begin;
                    System.out.println("updated len : "+ len);
                }
//                //check if strings are anagrams
//                if(end -begin == t.length()){
//                    minStart = begin;
//                    len = end-begin;
//                    System.out.println(" strings are anagrams !!!!!!");
//                }
                begin++;
            }

        }
        return len == Integer.MAX_VALUE ? "max len value" : s.substring(minStart,minStart+len);

    }
    /** Solution description !!!!!!
     * In "438. Find All Anagrams in a String" problem, the counter means the number of keys contained in hash table for string p.
     * Because we want to find all t's anagrams in s, we want to check all substring that matches t's anagrams.
     How can we check it? We can use a end pointer to go through s to check if an element in s matches an element in t.

     For example, if t = 'abb', s = 'abbabb'.
     Here we can create a hash table for string t :
     Key (Value) : a(1), b(2). [Here, counter =2]
     When iterating end, when it makes counter == 0, it means : substring 'abb' of s is an anagram of p.
     (This is because, we only decrement counter when the value of end is 0.
     Now, the hash table is : Key (Value) : a(0), b(0). [Here, counter =0, we increment end.]

     Knowing this, we want to continue checking whether "bba"is an anagram of t.
     Here, we update the begin pointer to the second char of s.
     Before we do so, we have to check if there is some impact by pervious begin, which is the first char of s.
     Because we slid the window to s.substring(1,4) instead of s.substring(0,3), we want to get rid of the previous impact of first char of s.

     We use map.get(tempc) > 0 to check whether or not s.charAt(begin) is matched with a key in hash table before .
     If it is matched before, we should increase counter because it would be unmatched when we only want to check s.substring(0,3).

     Why use map.get(tempc) > 0 ? Because in the outer while loop, for each char that is matched, its value must be larger than 0.
     (Because the char have to be in hash table.) In the outer while loop, we decrement the its value by 1, in the inner while loop, we increment its value by it. So, after all, its value should be larger than 0.

     Finally, we should check end - begin == t.length, because we want to make sure our matched substring have the same length with string t.
     The counter doesn't check the length for us, it only check whether all chars in string t can be found in s.substring.

     It takes me a while to understand the solution.
     I hope it helps : )*/
//        HashMap<Character, Integer> map = new HashMap();
//        for (char c : s.toCharArray())
//            map.put(c, 0);
//        System.out.println(" initial map...........");
//        System.out.println(map);
//        for (char c : t.toCharArray()) {
//            if (map.containsKey(c))
//                map.put(c, map.get(c) + 1);
//        }
//        System.out.println(" map aafter t conatins ............");
//        System.out.println(map);
//        int start = 0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE, counter = t.length();
//        while (end < s.length()) {// move the end index of sliding windows
//            char c1 = s.charAt(end);
//            System.out.println("cend : "+ c1);
//            if (map.get(c1) > 0)
//                counter--;
//            map.put(c1, map.get(c1) - 1);
//            System.out.println(" map after reduction....");
//            System.out.println(map);
//            System.out.println("counter ; "+ counter);
//
//            end++;
//            System.out.println("end : "+ end);
//            while (counter == 0) { // move the start index of sliding window
//                System.out.println("counter is 0 .................");
//                if (minLen > end - start) {
//                    minLen = end - start;
//                    minStart = start;
//                }
//                System.out.println(" min length : "+ minLen);
//                System.out.println("minStart : "+ minStart);
//
//                char c2 = s.charAt(start);
//                System.out.println(" c2 : "+ c2);
//                map.put(c2, map.get(c2) + 1);
//                System.out.println("map after adding c2.........");
//                System.out.println(map);
//
//                if (map.get(c2) > 0)
//                    counter++;
//                System.out.println("counter: "+ counter);
//                start++;
//            }
//        }
//        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
//    }
}
