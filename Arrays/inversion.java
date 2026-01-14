public class inversion{
    public static int inversion_count(int arr[]){
        int inv_count = 0;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i]>arr[j]){
                    inv_count++;
                }
            }
        }
        return inv_count;
    }
    public static void main(String args[]){
        int arr[] = {5,4,3,2,1};
        System.out.println("Inversion count : " + inversion_count(arr));
    }
}