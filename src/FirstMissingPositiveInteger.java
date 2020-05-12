import java.util.Arrays;

public class FirstMissingPositiveInteger {


    public static void main(String[] args) {
        int[] arr = {-5,8,-9,1,2,3,4,19};
        System.out.println(firstMissingNum(arr));
    }

    public static int firstMissingNum(int[] arr){
        int N = arr.length;
        boolean[] isExist = new boolean[arr.length];

        for(int i =0;i<N;i++){
            if(arr[i]>0 && arr[i]<N){
                isExist[arr[i]-1]= true;
            }

        }

        for(int j=0;j< N;j++){
            if(!isExist[j]){
                return j+1;
            }
        }

        return N+1;
    }


}
