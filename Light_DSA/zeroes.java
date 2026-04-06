public class zeroes{
    public static void zeroesMove(int nums[], int length){
        int left = 0;
        for(int i=0 ;i<length ; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
    public static void main(String args[]){
        int nums[] = {1,0,0,3,12};
        int n = nums.length;
        zeroesMove(nums,n);
        for(int i=0 ; i<nums.length ; i++){
            System.out.print(nums[i] + ",");
        }
        System.out.println("");
    }
}