public class duplicate{
    public static int find(int nums[]){
        // int duplicate1 = -1;
        // for(int i=0 ; i<arr.length ; i++){
        //     for(int j=i+1 ; j<arr.length ; j++){
        //         if(arr[i]==arr[j]){
        //             duplicate1 = arr[i];
        //         }
        //     }
        // }
        // return duplicate1;
         boolean[] bool = new boolean[nums.length];

        for(int i: nums){
            if(bool[i]){
                //if it's true then it's the duplicate number
                return i;
            }
            bool[i] = true;
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int arr[] = {3, 1, 3, 4, 2};
        int duplicate1 = find(arr);
        System.out.println(duplicate1);
    }
}