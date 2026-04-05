import java.util.*;

public class one{
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)) return true;
            set.add(i);
        }
        return false; 
    }

    public static void main(String args[]){
        int arr[] = {3,3};
        System.out.println(containsDuplicate(arr));
    }
}