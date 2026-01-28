
import java.util.*;

public class Three{
    public static List<List<Integer>> threeSum(int nums[]){
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0 ; i<n-2 ; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;

            int left = i+1, right = n-1;
            while(left<right){
                int sum = nums[i]+nums[left]+ nums[right];
                if(sum==0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left<right && nums[left]==nums[left+1])left++;
                    while(left<right && nums[right]==nums[right-1])right--;

                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {-1,-1,0,-4,1,2};
        List<List<Integer>> result = threeSum(nums);
        for(int i=0 ; i<result.size() ; i++){
            System.out.println(result.get(i) + ", ");
        }
    }
}