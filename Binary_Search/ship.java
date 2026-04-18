public class ship{
    public static int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low = Integer.MIN_VALUE;
        int ans = 0;
        int high = 0;
        for(int i=0 ; i<n ; i++){
            low = Math.max(weights[i], low);
            high+=weights[i];
        }
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(isPossible(weights, mid,days)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] weights, int capacity, int days){
        int load = 0;
        int day = 1;
        for(int i=0 ; i<weights.length ; i++){
            load+=weights[i];
            if(load>capacity){
                day++;
                load = weights[i];
            }
        }
        if(day<=days) return true;

        return false;
    }
    public static void main(String args[]){
        int weights[] = {3,2,2,4,1,4};
        int days = 3;
        System.out.println("Minimum days to ship products: " + shipWithinDays(weights, days));
    }
}