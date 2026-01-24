public class reversePairs{
    // public static int reversePairs2(int[] nums) {
    //     int cnt = 0;
    //     for(int i=0 ; i<nums.length ; i++){
    //         for(int j= i+1 ; j<nums.length ; j++){
    //             if(nums[i]>2*nums[j]){
    //                 cnt++;
    //             }
    //         }
    //     }
    //     return cnt;
    //}
    public static void merge(int arr[], int i, int j, int k){
        int leftpointer = i, rightpointer = j+1;
        int[] temp = new int[k-i+1];
        int tempIndex = 0;

        while(leftpointer<=j && rightpointer<=k ){
            if(arr[leftpointer]>=arr[rightpointer]){
                temp[tempIndex++] = arr[rightpointer];
                rightpointer++;
            }else{
            temp[tempIndex++] =  arr[leftpointer];
            leftpointer++;
        }
        }

        while(leftpointer<=j){
            temp[tempIndex++] = arr[leftpointer];
            leftpointer++;
        }
        while(rightpointer<=k){
            temp[tempIndex++] = arr[rightpointer];
            rightpointer++;
        }

        for(int u=0 ; u<temp.length ; u++){
            arr[i+u] = temp[u];
        }

    }

    public static int countReversePairs(int arr[],int low,int mid,  int high){
        int right = mid + 1;
        int cnt = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && arr[i] > 2 * arr[right]) right++;
            cnt += (right - (mid + 1));
        }
        return cnt;
    }
    public static int mergesort(int arr[], int low, int high){
        int cnt = 0;
        if(low>=high) return cnt;

        int mid = low + (high-low)/2;
        cnt+=mergesort(arr, low, mid);
        cnt+=mergesort(arr, mid+1, high);
        cnt+=countReversePairs(arr,low,mid,high);
        merge(arr,low,mid,high);

        return cnt;


    }
    public static int team(int arr[], int n){
        return mergesort(arr,0,n-1);
    }
    public static void main(String args[]){
        int arr[] = {1,3,2,3,1};
        int n = 5;
        //System.out.println(reversePairs2(arr));
        int cnt = team(arr,n);
        System.out.println("count is : " + cnt);

    }
}