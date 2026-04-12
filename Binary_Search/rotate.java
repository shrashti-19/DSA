public class rotate{
    public static int sortedRotated(int nums[], int n, int target){
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target) return mid;

            //left half sorted
            if(nums[low]<=nums[mid]){
                if(target>=nums[low] && target<nums[mid]){
                    high = mid-1;
                }else{
                    low= mid+1;
                }
            }

            //right half
            else{
                if(target> nums[mid] && target<nums[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,1,2,3};
        int n = nums.length;
        int target = 1;
        System.out.println("target found : " + sortedRotated(nums,n,target));
    }
}