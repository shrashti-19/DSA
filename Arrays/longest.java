import java.util.*;

public class longest{
    public static int longsub(int nums[]){
        int n = nums.length;
        Arrays.sort(nums);

        int length = 1;
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(nums[j]-nums[i]==1){
                    length++;
                }
            }
        }
        return length;
    }
    public static void main(String args[]){
        int nums[] = {100,4,200,1,3,2};
        System.out.println("Length of longest consecutive subsequence is : " + longsub(nums));
    }
}