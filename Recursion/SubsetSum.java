import java.util.*;

public class SubsetSum{
    public static void findSubset(int index, int currentSum, ArrayList<Integer>sum, int[]arr){
        int n = arr.length;
        if(index == n){
            sum.add(currentSum);
            return;
        }
        findSubset(index+1, currentSum+arr[index], sum, arr);
        findSubset(index+1, currentSum, sum, arr);
    }
    public static ArrayList subsetsums(int[]arr){
        ArrayList<Integer> sum = new ArrayList<>();
        findSubset(0,0,sum,arr);
        Collections.sort(sum);
        return sum;
    }
    public static void main(String agrs[]){
        int[] arr = {5,2,1};
        ArrayList<Integer> result = subsetsums(arr);

        for(int sum : result){
            System.out.print(sum + ",");
        }

        System.out.println("");
    }
}