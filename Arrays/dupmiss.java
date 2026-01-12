
import java.util.ArrayList;

public class dupmiss{
    public static int[] find(int nums[]){
        
        boolean[] bool = new boolean[nums.length+1];
        ArrayList<Integer> result = new ArrayList<>();
        for(int i : nums){
            if(bool[i]){
                result.add(i);
            }
            bool[i] = true;
        }

        for(int i=1 ; i <bool.length ;i++){
            if(!bool[i]){
                result.add(i);
            }
            
        }
        int[] ans = new int[result.size()];
        for(int i=0 ; i<result.size() ; i++){
            ans[i] = result.get(i);
        }
        return ans;
    }
    public static void main(String args[]){
        int[] nums = {3,5,4,1,1};
        int[] array = find(nums);

        for (int x : array) {
            System.out.print(x + " ");
        }

    }
}