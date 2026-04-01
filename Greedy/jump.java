
public class jump{
    public static  boolean canJump(int[] nums) {
        int n = nums.length;
        int maxReach = 0;
        for(int i=0 ; i<n  ; i++){
            if(i>maxReach) return false;
            maxReach = Math.max(maxReach,i+nums[i]);
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,1,0,4};
        System.out.println("Can it reach to last index? " + canJump(arr) );
    }
}