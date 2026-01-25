
import java.util.HashMap;

public class Twosum{
    // public static boolean isExist(int arr[], int target){
    //     for(int i=0 ; i<arr.length ; i++){
    //         for(int j=i+1 ; j<arr.length ; j++){
    //             if(arr[i] + arr[j] == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    //}
    public static int[] isExist(int arr[], int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0 ; i<arr.length ; i++ ){
            int need = target-arr[i];
            if(map.containsKey(need)){
                return new int[]{map.get(need), i};
            }else{
                map.put(arr[i], i);
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String args[]){
        int arr[]= {2,6,5,8,11};
        int target = 14;
        int[] ans = isExist(arr, target);
        System.out.println(ans[0] + " " + ans[1]);

    }
}