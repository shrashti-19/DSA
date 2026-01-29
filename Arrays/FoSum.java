import java.util.*;

public class FoSum{
    public static List<List<Integer>> fourSum(int nums[], int target){
        // Set<List<Integer>> set = new HashSet<>();

        // for(int i=0 ; i<nums.length ; i++){
        //     for(int j=i+1 ; j<nums.length ; j++){
        //         for(int k=j+1 ; k<nums.length ; k++){
        //             for(int l = k+1 ; l<nums.length ; l++){
        //                 int sum = nums[i]+ nums[j] + nums[k] + nums[l];
        //                 if(sum == target){
        //                     List<Integer> result = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
        //                     Collections.sort(result);
        //                     set.add(result);
        //                 } 
        //             }
        //         }
        //     }
        // }

        // return new ArrayList<>(set);
        Arrays.sort(nums);
        int n= nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0 ; i<n ;i++){
            if(i>0 && nums[i-1]==nums[i]) continue;

            for(int j=i+1 ; j<n ; j++){
                if(j>i+1 && nums[j-1]==nums[j]) continue;

                int left = j+1, right = n-1;
                while(left<right){
                    int sum = nums[left] + nums[right] + nums[i] + nums[j];
                    if(sum ==target){
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while(left<right && nums[left]==nums[left+1])left++;
                        while(left<right && nums[right]==nums[right-1]) right--;

                        left++;
                        right--;
                    }else if(sum<target)left++;
                    else{
                        right--;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String args[]){
        int nums[] = {1,0,-1,0,-2,2};
        List<List<Integer>> result = fourSum(nums,0);
        for (List<Integer> quad : result) {
            System.out.println(quad);
        }
    }
}