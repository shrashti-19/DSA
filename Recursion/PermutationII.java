import java.util.*;


public class PermutationII{
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int size = 0;
        boolean[] used = new boolean[n];
        findPermutation(nums,size,n,used,new ArrayList<>(), result);
        return result;
    }
    public static void findPermutation(int[]nums, int size, int n, boolean[]used, List<Integer>currentlist, List<List<Integer>>result){

        if(size==n){
            result.add(new ArrayList<>(currentlist));
            return;
        }

        for(int i=0 ; i<n ; i++){
            if(i>0 && nums[i]==nums[i-1] && used[i-1]==false) continue;
            if(!used[i]){
                currentlist.add(nums[i]);
                used[i] = true;
                findPermutation(nums,size+1,n,used, currentlist, result);
                currentlist.remove(currentlist.size()-1);
                used[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2};
        List<List<Integer>> result = permuteUnique(arr);
        for(List<Integer> ans : result){
            System.out.print(ans + " ");
        }
        System.out.println("");
    }
}