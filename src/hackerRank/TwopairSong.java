package hackerRank;


import java.util.*;

public class TwopairSong {

//    public int numPairsDivisibleBy60(int[] time) {
//        Map<Integer, Integer> count = new HashMap<>();
//        int ans = 0;
//        for (int t : time) {
//            int d = (60 - t % 60) % 60;
//            if (count.containsKey(d)) {
//                ans += count.get(d); } // in current HashMap, get the number of songs that if adding t equals to a multiple of 60.
//               count.put(t % 60, 1 + count.getOrDefault(t % 60, 0)); // update the number of t % 60.
//        }
//        return ans;
//    }

//    public int numPairsDivisibleBy60(List<Integer> songs) {
//        Map<Integer, Integer> count = new HashMap<>();
//        int ans = 0;
//        for (int i = 0; i <  songs.size(); i++) {
//            for (int j = i+1; j <songs.size() ; j++) {
//                 if((songs.get(i)+ songs.get(j))%60==0){
//                 ans++;
//                }
//            }
//        }
//
////            }
//////            int d = (60 - (songs.get(i) % 60)) % 60;
////            int d = (60 - (songs.get(i) % 60)) % 60;
////            System.out.println("  actaual value  " + songs.get(i) + "  d  " + d);
////
////            if (songs.contains(d)&(songs.indexOf(d)!=i)) {
////                System.out.println(" === actual value  " +  songs.get(i) +  "  d  " + d );
////                ans += 1;
//////                count.put(d, 1 + count.get(d)); // update the number of t % 60.
////            } else {
//////                count.put(d, 1);// update the number of t % 60.
////            }
////        }
////
////
//////            if (count.containsKey(d)) {
//////                ans += count.get(d);
//////                // in current HashMap, get the number of songs that if adding t equals to a multiple of 60.
////////            count.put(songs.get(i) % 60, 1 + count.getOrDefault(songs.get(i) % 60, 0)); // update the number of t % 60.
//////                count.put(d, 1 + count.get(d)); // update the number of t % 60.
//////            }
//////
//////            else
//////            {
//////                count.put(d, 0 ); // update the number of t % 60.
//////            }
////
////
////
////
////
////        //        for (int t : songs) {
//////            int d = (60 - t % 60) % 60;
//////            if (count.containsKey(d)) {
//////                ans += count.get(d); } // in current HashMap, get the number of songs that if adding t equals to a multiple of 60.
//////            count.put(t % 60, 1 + count.getOrDefault(t % 60, 0)); // update the number of t % 60.
//////        }
//////        return ans;
////
////        System.out.println("\n\n\nmap " + count);
//        return  ans;
//    }

    public int numPairsDivisibleBy60(List<Integer> songs) {
        Map<Integer, Integer> count = new HashMap<>();
        int ans = 0;
        for (int t : songs) {
            int d = (60 - t % 60) % 60;
            if (count.containsKey(d)) {
                ans += count.get(d);
                System.out.println(" d value " + count.get(d));
            }
            count.put(t % 60, 1 + count.getOrDefault(t % 60, 0));
            System.out.println("    actual " + t  + " d " + t%60);
            System.out.print(" \t ans== " + ans + "  dm " + count.get(d));
        }

        System.out.println("\n\n\nmap " + count);
        return ans;
    }
    public static void main(String[] args) {
        TwopairSong twopairSong = new TwopairSong();
//        Integer [] x= {30,  20,  150,  100, 150,40};
//        Integer [] x= {60,  60,  60};
//        Integer []x= {10 ,50, 90, 30};
        Integer []x= {120,180,10 ,50, 20,40, 30};
        List<Integer> list1 = Arrays.asList(x);
        System.out.println("   "  + twopairSong.numPairsDivisibleBy60(list1));
    }
}
