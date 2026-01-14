public class inversion{
    // public static int inversion_count(int arr[]){
    //     int inv_count = 0;
    //     for(int i=0 ; i<arr.length ; i++){
    //         for(int j=i+1 ; j<arr.length ; j++){
    //             if(arr[i]>arr[j]){
    //                 inv_count++;
    //             }
    //         }
    //     }
    //     return inv_count;
    // }
    public static int mergeSort(int arr[], int left, int right){
        int cnt=0;
        if(left>=right) return cnt;
        int mid = left + (right-left)/2;
        cnt+=mergeSort(arr, left, mid);
        cnt+=mergeSort(arr, mid+1, right);
        cnt+=merge(arr,left,mid,right);

        return cnt;
    }
    public static int merge(int arr[], int i, int j, int k){
        int leftPointer = i, rightpointer = j+1, tempindex=0;
        int[] temp = new int[k-i+1];
        int cnt = 0;

        while(leftPointer<=j && rightpointer<=k){
            if(arr[leftPointer]>arr[rightpointer]){
                temp[tempindex++] = arr[rightpointer];
                rightpointer++;
                cnt+=(j-leftPointer+1);
            }else{
                temp[tempindex++] = arr[leftPointer];
                leftPointer++;
                
            }
        }

        while(leftPointer<=j){
            temp[tempindex] = arr[leftPointer];
            leftPointer++;
        }

        while(rightpointer<=k){
            temp[tempindex++] = arr[rightpointer];
            rightpointer++;
        }

        for(int u=0 ; u<temp.length ; u++){
            arr[i+u] = temp[u];
        }
        return cnt;
    }
    public static int numberOfinversions(int arr[]){
        return mergeSort(arr,0,arr.length-1);
    }
    public static void main(String args[]){
        int arr[] = {5,4,3,2,1};
        int cnt = numberOfinversions(arr);
        System.out.println("Count : " + cnt);
    }
}