import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class

CombinationSums {

    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 50, 30};
        int target = 60;
//        findSubarray(arr, target);
//        System.out.println(" count is : "+ countSubArraysProudctLessThanK(arr,target));
    }
    static List<List<Integer>> findCombinationSum(int[] candidates, int target){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(candidates,0,target,0,list,result);
        return result;
    }

    static void helper(int[] candidates, int start, int target,
                       int sum, List<Integer> list, List<List<Integer>> result){
        if(sum> target){
            return;
        }
        if(sum == target){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<candidates.length-1;i++){
            list.add(candidates[i]);
            helper(candidates,i,target,sum+candidates[i+1],list,result);
            list.remove(list.size()-1);
        }
    }
}

