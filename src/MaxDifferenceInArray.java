import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    public Difference(int[] arr){
        this.elements = arr;
    }

    public void computeDifference(){
        int len = this.elements.length;
        maximumDifference = Integer.MIN_VALUE;
//        int max_so_far = elements[len-1];
//        for(int i = len-2 ;i >=0; i--){
//            if(elements[i]> max_so_far){
//                max_so_far = elements[i];
//                System.out.println("max_so_far == "+ max_so_far);
//            }else {
//                maximumDifference = Integer.max(maximumDifference, max_so_far-elements[i]);
//                System.out.println(" maxdiff == "+ maximumDifference);
//            }
//        }
        int max = elements[0];
        int min = elements[0];
        for(int i =1;i< len; i++){
            if (elements[i] > max){
                max = elements[i];
            }
            if (elements[i] < min){
                min = elements[i];
            }
        }

        maximumDifference = max - min;

    }
} // End of Difference class

 class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}