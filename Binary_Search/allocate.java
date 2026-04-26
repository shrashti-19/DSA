public class allocate{
    public static int minPages(int nums[], int n, int m){
        if(m>n) return -1;
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i=0 ; i<n ; i++){
            low = Math.max(low,nums[i]);
            high+=nums[i];
        }
        int ans = 0;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(isPossible(nums, mid, m)){
                ans = mid;
                high = mid-1; //minimized
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int nums[], int mid, int m){
        int count = 1, sum=0;
        for(int i=0 ; i<nums.length ; i++){
            sum+=nums[i];
            if(sum>mid){
                count++;
                sum = nums[i];
            }
        }
        if(count<=m) return true;
        return false;
    }
    public static void main(String args[]){
        int nums[] = {12,34,67,90};
        int n = 4,m=2;
        System.out.println("Minimum number of pages allocated : " + minPages(nums,n,m));
    }
}