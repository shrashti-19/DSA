public class six{
    public static int duplicates(int arr[]){
        int i= 0;
        for(int j=1 ; j<arr.length ; j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3};
        System.out.println("Removing duplicates from array : " + duplicates(arr));
    }
}