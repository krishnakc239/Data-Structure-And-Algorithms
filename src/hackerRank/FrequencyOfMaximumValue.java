package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FrequencyOfMaximumValue {

    /**
     * For a given array of integers, determine the maximum value in the segment
     * from each index to the highest index element, inclusive.
     * After that has been determined, determine the number of times that
     * highest value occurs in the segment. A number of queries will then be given,
     * where each query represents and index within the aray.
     *
     * create a return array with one value for each query: the number of times the maximum
     * value occurs in a segment starting at that index
     *
     * Example:
     * nubers = [5,4,3,5,2]
     * q=[1,2,3,4,5]
     *
     * Note : the numbers array indexes are from 1 to n where n is the length of the array
     *
     * For the first query, the index is 1. The segment starting at index 1 is [5,4,3,2].
     * The highest value is 5, and it occurs 2 times, result = [2]
     * For the second query, the index is 2, The segment starting at index 2 is [4,5,3,2]
     * The highest value is 5, and it occurs 1 time. result = [2,1]
     *
     * In each of the remaining segments queried, [5,3,2],[3,2] and [2], there is ony
     * one occurrence of a highest value so a 1 is appended to result for each query.
     * The final array returned is [2,1,1,1]
     * */

    public  static void frequencyOfMaximumValue(List<Integer> numbers, List<Integer> q){
        System.out.println(" initial numbers : "+ numbers);
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i =0; i< numbers.size(); i++){
            map.put(numbers.get(i),map.getOrDefault(numbers.get(i),0)+1);
        }
        System.out.println(" map :"+ map);

        List<Integer> result = new ArrayList<>();
        for (int j=0; j< q.size();j++){
            for (int k = q.get(j); k< numbers.size(); k++){

            }
        }

    }

    static  int findMax(List<Integer> numbers){
        int max = Integer.MIN_VALUE;
        for(int i=0;i< numbers.size();i++){
            max = numbers.get(i)> max ? numbers.get(i): max;
        }
        return  max;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);

        List<Integer> q = new ArrayList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);


        frequencyOfMaximumValue(arr,q);
    }
}
