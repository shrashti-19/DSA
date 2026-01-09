public class merge2sortedarrays{
    public static void merge(int nums1[], int nums2[]){
        if(nums1.length > nums2.length){
            for(int i=0 ; i<nums1.length ;i++){
                for(int j=0  ;j<nums2.length ; j++){
                    if(nums1[i]>nums2[j]){
                        int temp = nums1[i];
                        nums1[i] = nums2[j];
                        nums2[j] = temp;
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        int nums1[] = {-5,-2,4,5,0,0,0};
        int nums2[] = {-3,1,8};
        merge(nums1, nums2);

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