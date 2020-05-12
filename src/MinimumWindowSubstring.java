/**
 * Given strings S and T, find the minimum (contiguous) substring W of S, so that T is a subsequence of W.
 * <p>
 * If there is no such window in S that covers all characters in T, return the empty string "". If there are multiple such minimum-length windows, return the one with the left-most starting index.
 * Example 1:
 * <p>
 * Input:
 * S = "abcdebdde", T = "bde"
 * Output: "bcde"
 * Explanation:
 * "bcde" is the answer because it occurs before "bdde" which has the same length.
 * "deb" is not a smaller window because the elements of T in the window must occur in order.
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * There are so many substring search problems which could be solved by the sliding window algorithm.
 * So I sum up the algorithm template here. Wish it will help you!
 *
 * The similar questions are:
 * Find All Anagrams in a String
 * Q: https://leetcode.com/problems/find-all-anagrams-in-a-string/
 * A: https://github.com/cherryljr/LeetCode/blob/master/Find%20All%20Anagrams%20in%20a%20String.java
 * Minimum Window Substring
 * Q: https://leetcode.com/problems/minimum-window-substring/
 * A: https://github.com/cherryljr/LeetCode/blob/master/Minimum%20Window%20Substring.java
 * Permutation in String
 * Q: https://leetcode.com/problems/permutation-in-string/description/
 * A: https://github.com/cherryljr/LeetCode/blob/master/Permutation%20in%20String.java
 * Longest Substring Without Repeating Characters
 * Q: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * A: https://github.com/cherryljr/LeetCode/blob/master/Longest%20Substring%20Without%20Repeating%20Characters.java
 * Longest Substring with At Most Two Distinct Characters
 * Q: https://leetcode.com/problems/longest-substring-with-at-most-two-distinct-characters/
 * A: https://github.com/cherryljr/LeetCode/blob/master/Longest%20Substring%20with%20At%20Most%20Two%20Distinct%20Characters.java
 * Subarrays with K Different Integers
 * Q: https://leetcode.com/problems/subarrays-with-k-different-integers/
 * A: https://github.com/cherryljr/LeetCode/blob/master/Subarrays%20with%20K%20Different%20Integers.java
 * Substring with Concatenation of All Words
 * Q: https://leetcode.com/problems/substring-with-concatenation-of-all-words/
 * A: https://github.com/cherryljr/LeetCode/blob/master/Substring%20with%20Concatenation%20of%20All%20Words.java
 * /
 / *
 This Template is based on question: Find All Anagrams in a String
 Description
 Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
 The order of output does not matter.

 Example:
 Input:
 s: "abab" p: "ab"

 Output:
 [0, 1, 2]

 Explanation:
 The substring with start index = 0 is "ab", which is an anagram of "ab".
 The substring with start index = 1 is "ba", which is an anagram of "ab".
 The substring with start index = 2 is "ab", which is an anagram of "ab".
 */

public class MinimumWindowSubstring {

    public static void main(String[] args) {
        System.out.println("min window : " + slidingWindowTemplate("aabcdsdebce", "cde"));

    }
    public static List<Integer> slidingWindowTemplate(String s, String t) {
// Init a collection or int value to save the result according to the question.
        List<Integer> result = new LinkedList<>();
        if (t.length() > s.length()) {
            return result;
        }

// Create a hashmap to save the Characters of the target substring.
// map represents the missing characters and the corresponding number
// (K, V) = (Character, Frequency of the Characters)
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

// Maintain a counter to check whether match the target string.
// Must be the map size, NOT the string size because the char may be duplicate.
        int counter = map.size();

// Two Pointers: begin-left pointer of the window; end-right pointer of the window
        int begin = 0, end = 0;

// The length of the substring which match the target string.
        int len = Integer.MAX_VALUE;

// Loop at the beginning of the source string
        while (end < s.length()) {
// Get a character
            char cEnd = s.charAt(end);

            if (map.containsKey(cEnd)) {
// Plus or minus one
                map.put(cEnd, map.get(cEnd) - 1);
// Modify the counter according the requirement (different condition).
// Plus or minus is all possible
                if (map.get(cEnd) == 0) {
                    counter--;
                }
            }
// Note that the end ++ operation here will cause end to move back one position,
// So in the following code, end represents the position behind the right border of the subarray.
            end++;

// Increase begin pointer to make it invalid / valid again
            while (counter == 0 /*counter condition.different question may have different condition */){
// Be careful here: choose the char at begin pointer, NOT the end pointer
                char cBegin = s.charAt(begin);
                if (map.containsKey(cBegin)) {
// Plus or minus one
                    map.put(cBegin, map.get(cBegin) + 1);
                    if (map.get(cBegin) > 0) {
// Modify the counter according the requirement (different condition).
                        counter++;
                    }
                }

// save / update (min / max) the result if find a target
// result collections or result int value
// Pay Attention Here:
// This type of question (template) is to update the result here or add the subarray to the result set,
// Because entering the while loop means that the subarray at this time meets our requirements.
// But in another way of writing (only one String, there is no Map at the beginning. The map represents the characters and the corresponding number of occurrences)
// We update the results outside the while loop,
// This is because in that way, subarrays that don't meet the conditions will enter the while loop.
// Example: Longest Substring with At Most Two Distinct Characters and Longest Substring Without Repeating Characters

// move the left bound forward
// make the substring (sliding window) invalid / valid again, so we can move on
                begin++;
            }

// Another way is to update the result here
// The summary is: where the conditions are true, the results are updated.
// The essence is the meaning of two coordinates:
// begin represents the left border position of the desired subarray;
// end represents the next position to the right of the desired subarray.
// This definition is the same in both approaches, so we only need to update the results where appropriate based on the definition
        }
        return result;
    }
}