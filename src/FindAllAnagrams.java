import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if(s.length() ==0 || p.length() > s.length()) return result;

        int[] pmap= new int[26];
        for(char c: p.toCharArray()){
            pmap[c-'a']++;
        }

        int begin=0;
        int end=0;
        int count= p.length();

        while(end < s.length()){
            //move right everytime, if the character exists in p's hash, decrease the count
            //current hash value >= 1 means the character is existing in p

            if(pmap[s.charAt(end++ )-'a']-- >=1 ) count--;

            //when the count is down to 0, means we found the right anagram
            //then add window's left to result list

            if(count ==0) result.add(begin);

            //if we find the window's size equals to p, then we have to move left (narrow the window) to find the new                  match window
            //++ to reset the hash because we kicked out the left
            //only increase the count if the character is in p
            //the count >= 0 indicate it was original in the hash, cuz it won't go below 0

            if((end-begin) == p.length() && pmap[s.charAt(begin++)-'a']++ >=0) count++;
        }
        return result;

    }
}
