import java.util.*;

public class FoSum{
    public static List<List<Integer>> fourSum(int nums[], int target){
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0 ; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                for(int k=j+1 ; k<nums.length ; k++){
                    for(int l = k+1 ; l<nums.length ; l++){
                        int sum = nums[i]+ nums[j] + nums[k] + nums[l];
                        if(sum == target){
                            List<Integer> result = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                            Collections.sort(result);
                            set.add(result);
                        } 
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
    public static void main(String args[]){
        int nums[] = {1,0,-1,0,-2,2};
        List<List<Integer>> result = fourSum(nums,0);
        for(int i=0 ; i<result.size() ; i++){
            System.out.print(result.get(i) +  ", ");
        }
        System.out.println();
    }
}