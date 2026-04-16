public class split{ 
public static int splitArray(int[] nums, int k) {
        int n = nums.length;
        int low = Integer.MIN_VALUE;
        int ans = 0;
        int high = 0;
        for(int i=0 ; i<n ; i++){
            low = Math.max(nums[i],low);
            high+=nums[i];
        }

        while(low<=high){
            
            int mid = low + (high-low)/2;
            if(isPossible(nums,mid,k)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int nums[], int mid, int k){
        int parts = 1;
        int sum=0;
        for(int i=0 ; i<nums.length; i++){
            sum+=nums[i];
            if(sum>mid){
                parts++;
                sum = nums[i];
            }
        }
        if(parts<=k) return true;
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {7,2,5,10,8};
        int k = 2;
        System.out.println("Split arrays with max sum : "+ splitArray(nums, k));
    }

}