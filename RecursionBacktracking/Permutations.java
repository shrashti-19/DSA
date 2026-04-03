import java.util.*;

public class Permutations{
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        int size=0;
        int n = nums.length;
        boolean[] used = new boolean[n];
        findPermutation(nums,used,result,size,n,new ArrayList<>());
        return result;
    }
    public static void findPermutation(int[]nums, boolean[]used,List<List<Integer>>result, int size, int n, List<Integer>currentlist){
        if(size==n){
            result.add(new ArrayList<>(currentlist));
            return;
        }
        for(int i=0 ; i<n; i++){
            if(!used[i]){
                currentlist.add(nums[i]);
                used[i]=true;
                findPermutation(nums, used, result, size+1, n, currentlist);
                currentlist.remove(currentlist.size()-1);
                used[i]=false;
            }
        }
        
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        List<List<Integer>> result = permute(nums);
        for(List<Integer>ans : result){
            System.out.print(ans + ",");
        }
        System.out.println("");

    }
}