public class jumpII{
    public static int jump(int[] nums) {
        int n = nums.length;
        int currentend = 0;
        int maxreach=0, count=0;
        for(int i=0 ; i<n-1 ; i++){
            maxreach = Math.max(maxreach,i+nums[i]);
         
            if(i==currentend){
                count++;
                currentend = maxreach;
            }
        }
        return count;
    }

    public static void main(String args[]){
        int nums[] = {2,1,1,3,4};
        System.out.println("Minimum jumps : " + jump(nums));
    }
}