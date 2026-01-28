public class TwoII{
    public static int[] twoverison(int arr[], int target){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left<=right){
            int sum = arr[left] + arr[right];
            if(sum==target){
                return new int[]{left+1,right+1};
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int[] result = twoverison(arr,9);
        for(int i=0 ; i<result.length ; i++){
            System.out.println(result[i] + ", ");
        }
    }
}