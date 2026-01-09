public class merge2sortedarrays{
    // public static void merge(int nums1[], int nums2[]){
    //     if(nums1.length > nums2.length){
    //         for(int i=0 ; i<nums1.length ;i++){
    //             for(int j=0  ;j<nums2.length ; j++){
    //                 if(nums1[i]>nums2[j]){
    //                     int temp = nums1[i];
    //                     nums1[i] = nums2[j];
    //                     nums2[j] = temp;
    //                 }
    //             }
    //         }
    //     }
    // }
    public static void merge(int nums1[], int nums2[], int m, int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(j>=0){
            if( i>=0 && nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
    }
    public static void main(String args[]){
        int nums1[] = {-5,-2,4,5,0,0,0};
        int nums2[] = {-3,1,8};
        int m = 4;
        int n = 3;
        merge(nums1, nums2,m,n);

        System.out.println("nums1:");
        for (int i = 0; i < nums1.length; i++) {
          System.out.print(nums1[i] + " ");
        }

        System.out.println();
        System.out.println("nums2:");
        for (int i = 0; i < nums2.length; i++) {
         System.out.print(nums2[i] + " ");
        }
    }
}