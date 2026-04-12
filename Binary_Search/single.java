public class single{
    public static int singleElement(int nums[]){
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            int mid = low + (high-low)/2;
            if(mid%2==1) mid--;
            if(nums[mid]==nums[mid+1]) low = mid+2;
            else high = mid;
        }
        return nums[low];
    }
    public static void main(String[] args) {
        int nums[] = {1,1,2,2,3};
        System.out.println("Single element in a sorted array : " + singleElement(nums));
    }
}