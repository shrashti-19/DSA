public class power{
    private static double power2(double x, int n){
        if(n==0) return 1.0;
        if(n==1) return x;

        if(n%2==0){
            return power2(x*x, n/2);
        }
        return x*power2(x, n-1);
    }
    public static double mypow(double x, int n){
        if(n<0){
            return 1.0/power2(x,-n);
        }
        return power2(x,n);
    }
    public static void main(String[] args) {
        double x = 2.0000;
        int n = 13;
        System.out.println(mypow(x,n));
    }
}