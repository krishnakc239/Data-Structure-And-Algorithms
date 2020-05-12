import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LongestConsecutiveSubArrayIndex {

    public static void main(String[] args) {
        int[] arr ={4,10,45,1,2,3,5};
        System.out.println(Arrays.toString(findLongestSubsequence(arr)));
    }

    public static int[] findLongestSubsequence(int[] arr){

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< arr.length; i++){
            map.put(arr[i],i);
        }
        int len =0;
        int max =-1;
        int min = -1;
        for(int num: arr){
            List<Integer> subList = new ArrayList<>();
            while (map.containsKey(num)){
                subList.add(num);
                num--;
            }
            System.out.println(subList);
            if(subList.size() > len){
                max= subList.get(0);
                min= subList.get(subList.size()-1);
//                maxIndex= map.get(subList.get(0));
//                minIndex= map.get(subList.get(subList.size()-1));
            }
            len = subList.size();
        }

        return new int[]{max,min};

    }
}
