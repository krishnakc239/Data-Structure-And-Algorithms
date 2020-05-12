import java.util.HashMap;

public class TwoSumSet {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = findTwoSumSet(arr,target);
        for (int a:result  ) {
            System.out.print(a+", ");
        }
    }

    static int[] findTwoSumSet(int[] arr, int target){

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] result = new int[2];
        for(int i=0; i< arr.length;i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                result[0]=map.get(complement);
                result[1]= i;
            }else {
                map.put(arr[i],i);
            }
        }
        return result;
    }
}
