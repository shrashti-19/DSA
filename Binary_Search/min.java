public class min{
    public static int findMin(int[] nums) {
        //searching for an element but eliminating the possivle halves
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            int mid = low +  (high-low)/2;

            if(nums[mid]>nums[high]){
                low = mid+1;
            }else{
                high = mid;
            }

        }
        return nums[low];
    }
    public static void main(String args[]){
        int nums[] = {4,5,6,1,2,3};
        System.out.println("Min element is : " + findMin(nums));
    }
}