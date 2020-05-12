import java.util.Arrays;

public class QuickSelect {

    public static void main(String[] args) {
        int[] arr = {4,8,2,3,10,6};
        int result = quickSelect(arr,0,arr.length-1,1);
        System.out.println("result : "+ result);
    }


    static int quickSelect(int[] arr, int left, int right, int k){

        if(left == right){
            return arr[left];
        }
        int pivotIndex = randomPivot(arr,left,right);
        pivotIndex = partition(arr,left,right,pivotIndex);

        if(k == pivotIndex){
            return arr[pivotIndex];
        }else if (k < pivotIndex){
            return quickSelect(arr,left,pivotIndex-1,k);
        }else {
            return quickSelect(arr,pivotIndex+1,right,k);
        }
    }


    static int partition(int [] arr, int left, int right, int pivotIndex){
        System.out.println(Arrays.toString(arr));
        int pivotValue = arr[left];
        System.out.println("pivot : "+ pivotValue);
        swap(arr,pivotIndex,right);
        int storeIndex = left;
        for (int i=0; i< right;i++){
            if (arr[i] < pivotValue){
                swap(arr,i,storeIndex);
                System.out.println(" swapped "+ storeIndex+ " and "+ i);
                System.out.println(Arrays.toString(arr));
                storeIndex++;
            }
        }
        swap(arr,storeIndex,right);
        System.out.println(Arrays.toString(arr));
        return storeIndex;
    }

    static void swap(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int randomPivot(int[] arr, int left , int right){
        return left+ (int)(Math.random() * (right-left+1));
    }
}
