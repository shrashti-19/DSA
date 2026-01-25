public class Twosum{
    public static boolean isExist(int arr[], int target){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]= {2,6,5,8,11};
        int target = 15;
        System.out.println("Target exists in the array: " + isExist(arr, target));
    }
}