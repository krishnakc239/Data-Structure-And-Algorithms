import java.util.HashMap;

public class ValidAnagrams {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : sArr){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(char c : tArr){
            if(map.containsKey(c)){
                map.put(c, map.get(c)-1);
            }else{
                return false;
            }
        }

        for(Integer i: map.values()){
            if(i!=0){
                return false;
            }
        }

        return true;

    }
}
