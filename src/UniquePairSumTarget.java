import java.util.HashMap;
import java.util.Map;

public class UniquePairSumTarget {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,8,6,5};
        System.out.println(twoSum6(arr,5));
    }
    public static int twoSum6(int[] nums, int target) {
        // Write your code here
        if (nums == null || nums.length < 2) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int count = 0;
        for (int number : map.keySet()) {
            if (map.get(number) == 0) {
                continue;
            }
            int required = target - number;
            if (map.containsKey(required)) {
                if (required == number && map.get(number) > 1) {
                    count++;
                    map.put(number, 0);
                } else if (required != number && map.get(required) > 0) {
                    count++;
                    map.put(number, 0);
                    map.put(required, 0);
                }
            }
        }
        return count;
    }
}
