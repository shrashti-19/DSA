public class nthRoot{
    public static int Root(int n, int m){
        int low = 0;
        int high = m;
        while(low<=high){
            int mid = low  +(high-low)/2;
            long power = (long)Math.pow(mid, n);
            if(power == m) return mid;
            else if(power > m) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
    public static void main(String[] args) {
        int n = 3, m =27;
        System.out.println("Nth root of an integer" + Root(n,m));
    }
}