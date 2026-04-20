
public class koko{
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        int n = piles.length;
        for(int i=0 ; i<n ; i++){
            high = Math.max(piles[i],high);
        }
        int ans = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isPossible(piles,n,h,mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int piles[], int length, int h, int mid){
        long hours=0;
        for(int i=0 ; i<length ; i++){
            hours += (int)Math.ceil((double)piles[i] / mid);
        }
        if(hours<=h) return true;
        return false;
    }
    public static void main(String args[]){
        int piles[] = {3,6,7,11};
        int h= 8;

        System.out.println("Min eating speed: " + minEatingSpeed(piles, h));

    }
}