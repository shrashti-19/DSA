import java.util.*;

public class CombinationSumII{
     public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        findcomb(0,candidates,target, new ArrayList<>(), result);
        return result;
    }

    public static void findcomb(int index, int candidates[], int target, List<Integer>currentlist, List<List<Integer>>result){
        if(target == 0){
            //valid combination 
            result.add(new ArrayList<>(currentlist));
            return;
        }
        if(target<0 || index == candidates.length){
            return;
        }

        for(int i=index ; i<candidates.length ; i++){
            if(i>index && candidates[i-1]== candidates[i]) continue;; //duplicate skip

            currentlist.add(candidates[i]);
            findcomb(i+1, candidates, target-candidates[i], currentlist, result);
            currentlist.remove(currentlist.size()-1);

        }
    }

    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;

        List<List<Integer>> result = combinationSum2(candidates, target);
        for(List<Integer> ans : result){
            System.out.print(ans + ",");
        }
        System.out.println("");
    }
}