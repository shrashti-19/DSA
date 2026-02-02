
import java.util.HashMap;

public class countXOR{
    public static int count(int arr[], int k){
        // int count  =0;
        // for(int i=0 ; i<arr.length; i++){
        //     int xor=0;
        //     for(int j=i ; j<arr.length ; j++){
        //         xor=xor^arr[j];

        //         if(target==xor){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        int count =0;
        int prefixxor = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num : arr){
            prefixxor = prefixxor^num;

            int target = prefixxor^k;
            if(map.containsKey(target)){
                count+=map.get(target);
            }
            map.put(prefixxor, map.getOrDefault(prefixxor, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,2,6,4};
        int target = 6;
        System.out.println("The number of subarrays with given XOR k : " + count(arr,target));
    }
}