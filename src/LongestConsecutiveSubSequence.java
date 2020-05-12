import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubSequence {

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2,5};
        System.out.println(findLongestSubsequence(arr));
    }


    public static int findLongestSubsequence(int[] arr){

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n: arr){
            map.put(n,1);
        }
        int len = 0;
        for(int num: arr){
            int longest = num;
            int localLength =0;
            while (map.containsKey(num)){
                localLength = localLength+map.get(num);
                map.remove(num);
                num--;
            }
            map.put(longest,localLength);
            len = Math.max(len,localLength);
        }

        return len;

    }
}
