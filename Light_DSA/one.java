public class one{
    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        boolean[] duplicates = new boolean[n+1];
        //int dup = -1;
        for(int i : nums){
            if(duplicates[i]){
                return true;
            }
            duplicates[i] = true;
        }

        return false;  
    }

    public static void main(String args[]){
        int arr[] = {1,2,3};
        System.out.println(containsDuplicate(arr));
    }
}