import java.util.*;

public class CombinationSum{
   public static List<List<Integer>> findsums(int arr[], int target){
     List<List<Integer>> result = new ArrayList<>();
     List<Integer> currentlist = new ArrayList<>();

     combsum(0,result,currentlist,arr,target);

     return result;
   }
   public static void combsum(int index, List<List<Integer>> result, List<Integer> currentlist, int[]arr, int target){
      if(target==0){
        //find a valid combination 
        result.add(new ArrayList<>(currentlist));
        return;
      }
      if(index == arr.length || target < 0){
        //invalid path
        return;
      }

      currentlist.add(arr[index]);
      combsum(index, result, currentlist, arr, target-arr[index]);
      currentlist.remove(currentlist.size()-1);

      //not pick 
      combsum(index+1, result, currentlist, arr, target);




   }
    public static void main(String[] args) {
        int arr[] = {2,3,6,7};
        int target = 7;

        List<List<Integer>> result = findsums(arr,target);
        for(List<Integer> ans : result){
            System.out.print(ans + ",");
        }
        System.out.println("");
    }
}