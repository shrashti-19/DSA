public class kth{
     public static int kthElement(int a[], int b[], int k) {
        // code here
        if(a.length > b.length){
            return kthElement(b,a,k);
        }
        int n1 = a.length;
        int n2 = b.length;
        
        int low = Math.max(0, k - n2);
        int high = Math.min(k, n1);
        int left = k;
        
        while(low<=high){
            int cut1 = low + (high-low)/2;
            int cut2 = left-cut1;
            
            int l1 = (cut1==0) ? Integer.MIN_VALUE : a[cut1-1];
            int l2 = (cut2==0) ? Integer.MIN_VALUE : b[cut2-1];
            
            int r1 = (cut1==n1) ? Integer.MAX_VALUE : a[cut1];
            int r2 = (cut2==n2) ? Integer.MAX_VALUE : b[cut2];
            
            if(l1<=r2 && l2<=r1){
                return Math.max(l1,l2);
            }
            else if(l1>r2){
                high = cut1-1;
            }else{
                low = cut1+1;
            }
        }
        return -1;
        
        
    }
    public static void main(String[] args) {
        int a[] = {2,3,6,7,9};
        int b[] = {1,4,8,10};
        int k = 5;
        System.out.println("Kth smallest element : " + kthElement(a, b, k));

    }
}