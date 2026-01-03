// problem statement : we have found the max sum from the subarray now follow up question will be to print the subarray that gives that sum.

public class kadensFollowup{
    public static int kadensFollow (int nums[]){
        long maxi = Integer.MIN_VALUE;
        long sum = 0;
        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;

        for(int i=0 ; i<nums.length ; i++){
            if(sum == 0){
                start = i;
            }

            sum+=nums[i];
            if(sum>maxi){
                maxi =sum;
                ansStart = start;
                ansEnd = i;
            }

            if(sum<0){
                sum = 0;
            }
        }
        System.out.print("The subarray is : [");
        for(int i=ansStart ; i<=ansEnd ; i++){
            System.out.print(nums[i] + ",");
        }
        System.out.println("]");
        return (int) maxi;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,5,-2,7,-4};
        int maxSum = kadensFollow(nums);
        System.out.println("The maximum subarray sum is: " + maxSum);
        
    }
}