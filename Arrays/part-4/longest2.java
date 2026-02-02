import java.util.*;

public class longest2{
    public static int lengthLongestSubarray(int arr[]){
        int maxlen = 0;
        HashMap<Integer, Integer> sumindexmap = new HashMap<>();

        int sum =0;
        for(int i=0 ; i<arr.length; i++){
            sum+=arr[i];

            if(sum == 0){
                maxlen = i+1;
            }else if(sumindexmap.containsKey(sum)){
                maxlen = Math.max(maxlen, i - sumindexmap.get(sum));
            }else{
                sumindexmap.put(sum,i);
            }
        }
        return maxlen;
    }
    public static void main(String args[]){
        int arr[] = {9,-3,3,-1,6,-5};
        System.out.println(lengthLongestSubarray(arr));
    }
}