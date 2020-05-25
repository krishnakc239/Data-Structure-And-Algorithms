package hackerRank;

import java.util.*;

public class CountPairing {
    public  int countPars(List<Integer> n, int k){
      Set<Integer> s= new HashSet<Integer>();
      Integer sv=0;
        for (int i = 0; i <n.size() ; i++) {
             sv= n.get(i) + k;
             if(n.contains(sv)){
                 s.add(sv);
             }
        }
        System.out.println("set value= " + s);
        return s.size();
    }
    public static void main(String[] args) {
        CountPairing countPairing= new CountPairing();
        List<Integer> numbers= new ArrayList<>();
//         Integer [] x= { 1,1,1,2};
        Integer [] x= { 1, 2,2,3};
        numbers= Arrays.asList(x);
        System.out.println( "count ="  + countPairing.countPars(numbers, 1));

    }
}
