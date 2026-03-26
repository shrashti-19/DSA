import java.util.*;

public class Subset{
    public static void subset(int index, ArrayList<Integer> currentList, ArrayList<ArrayList<Integer>> result, int[] arr){
        result.add(new ArrayList<>(currentList));

        for(int i=index ; i<arr.length ; i++){
            //add
            currentList.add(arr[i]);

            //recurse
            subset(i+1, currentList, result, arr);

            //remove
            currentList.remove(currentList.size()-1);
        }
    }

    public static ArrayList<ArrayList<Integer>> subsets(int arr[]){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        subset(0, new ArrayList<>(), result, arr);
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1,2};

        ArrayList<ArrayList<Integer>> result = subsets(arr);
        for(ArrayList<Integer> currentList : result){
            System.out.print(currentList + ", ");
        }
        System.out.println("");
    }
}