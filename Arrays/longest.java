import java.util.*;

public class longest{
    public static int longsub(int nums[]){
        //int n = nums.length;
        Arrays.sort(nums);

        // int length = 1;
        // for(int i=0 ; i<n ; i++){
        //     for(int j=i+1 ; j<n ; j++){
        //         if(nums[j]-nums[i]==1){
        //             length++;
        //         }
        //     }
        // }
        // return length;
        // int length=1;
        // int maxLen = Integer.MIN_VALUE;
        // for(int i=1 ; i<n ; i++){
        //     if(nums[i]-nums[i-1]==1){
        //         length++;
        //         maxLen = Math.max(maxLen, length);
        //     }else{
        //         length=1;
        //     }
        // }
        // return maxLen;

        int length = 1, maxlen = 1;
        int n = nums.length;

        for(int i=1 ; i<n; i++){
            //edge case
            if(nums.length==0) return 0;
            //duplicates
            if(nums[i]==nums[i-1]) continue;
            if(nums[i]-nums[i-1]==1)length++;
            else{
                length=1;
            }
            maxlen = Math.max(maxlen,length);
        }
        return maxlen;
    }
    public static void main(String args[]){
        int nums[] = {0,3,7,2,5,8,4,6,0,1};
        System.out.println("Length of longest consecutive subsequence is : " + longsub(nums));
    }
}