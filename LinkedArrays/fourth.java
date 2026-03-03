public class fourth{
    public static int trappedRainwater(int arr[]){
        int n = arr.length;
        int maxLeft[] = new int[n];
        maxLeft[0] = arr[0];
        for(int i=1 ; i<n ;i++){
            maxLeft[i] = Math.max(maxLeft[i-1], arr[i]);
        }

        int maxRight[] = new int[n];
        maxRight[n-1] = arr[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            maxRight[i] = Math.max(maxRight[i+1], arr[i]);
        }

        int watertrapped = 0;
        for(int i=0 ; i<n ; i++){
            watertrapped += Math.min(maxLeft[i], maxRight[i]) - arr[i];
        }
        return watertrapped;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Trapped rainwater is : " + trappedRainwater(arr));
    }
}