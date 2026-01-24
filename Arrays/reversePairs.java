public class reversePairs{
    public static int reversePairs2(int[] nums) {
        int cnt = 0;
        for(int i=0 ; i<nums.length ; i++){
            for(int j= i+1 ; j<nums.length ; j++){
                if(nums[i]>2*nums[j]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String args[]){
        int arr[] = {1,3,2,3,1};
        System.out.println(reversePairs2(arr));

    }
}