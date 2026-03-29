import java.util.*;

public class Permutation{
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        boolean[] used = new boolean[n];
        findpermutation(nums,used, result,n, new ArrayList<>(),0);
        return result;
    }
    public static void findpermutation(int[]nums, boolean[]used, List<List<Integer>>result, int n, List<Integer>currentlist, int size){
        if(size==n){
            result.add(new ArrayList<>(currentlist));
            return;
        }
        

        for(int i=0 ; i<nums.length ; i++){
            if(!used[i]){
                currentlist.add(nums[i]);
                used[i] = true;
                findpermutation(nums,used, result, n, currentlist,size+1);
                currentlist.remove(currentlist.size()-1);
                used[i] = false;
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3};
        List<List<Integer>> result = permute(arr);
        for(List<Integer> ans : result){
            System.out.print(ans + ",");
        }
        System.out.println("");
    }
}