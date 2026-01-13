public class merge{
    public static void mergesort(int nums[], int left, int right){
        if(left>=right) return;

        int mid = left + (right-left)/2;
        mergesort(nums, left, mid);
        mergesort(nums, mid+1, right);
        merges(nums,left,mid,right);
    }
    public static void merges(int nums[], int i, int j, int k){
        int temp[] = new int[k-i+1];
        int tempindex = 0;
        int leftpointer = i, rightpointer = j+1;
        while(leftpointer<=j && rightpointer<=k){
            if(nums[leftpointer]>=nums[rightpointer]){
                temp[tempindex++] = nums[rightpointer];
                rightpointer++;
            }else{
                temp[tempindex++] = nums[leftpointer];
                leftpointer++;
            }
        }

        while(leftpointer<=j){
            temp[tempindex++] = nums[leftpointer];
            leftpointer++;
        }
        while(rightpointer<=k){
            temp[tempindex++] = nums[rightpointer];
            rightpointer++;
        }

        for(int u=0 ; u<temp.length ;u++){
            nums[i+u] =temp[u];
        }
    }
    public static void main(String[] args) {
        int nums[] = {4,3,2,1};
        mergesort(nums,0,nums.length-1);
        for(int i=0 ; i<nums.length ; i++){
            System.out.print(nums[i] + ",");
        }
        System.out.println("");
    }
}