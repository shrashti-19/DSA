public class countXOR{
    public static int count(int arr[], int target){
        int count  =0;
        for(int i=0 ; i<arr.length; i++){
            int xor=0;
            for(int j=i ; j<arr.length ; j++){
                xor=xor^arr[j];

                if(target==xor){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,2,6,4};
        int target = 6;
        System.out.println("The number of subarrays with given XOR k : " + count(arr,target));
    }
}