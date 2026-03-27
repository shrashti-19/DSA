import java.util.*;

public class subsetII{
    public static void subset(int index, ArrayList<Integer> currentList, ArrayList<ArrayList<Integer>> result, int arr[]){
      

        result.add(new ArrayList<>(currentList));
        for(int i=index ; i<arr.length ; i++){
            if(i>index && arr[i]==arr[i-1]) continue;

            currentList.add(arr[i]);
            subset(i+1, currentList, result, arr);
            currentList.remove(currentList.size()-1);
        }
    }
    public static ArrayList<ArrayList<Integer>> subsets(int arr[]){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        subset(0, new ArrayList<>(), result, arr);
        return result;
    }
    public static void main(String args[]){
        int arr[] = {1,2,2};
        ArrayList<ArrayList<Integer>> result = subsets(arr);
        for(ArrayList<Integer>ans : result){
            System.out.print(ans + " ");
        }

        System.out.println("");
    }
}