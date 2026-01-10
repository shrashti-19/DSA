public class duplicate{
    public static int find(int arr[]){
        // int duplicate1 = -1;
        // for(int i=0 ; i<arr.length ; i++){
        //     for(int j=i+1 ; j<arr.length ; j++){
        //         if(arr[i]==arr[j]){
        //             duplicate1 = arr[i];
        //         }
        //     }
        // }
        // return duplicate1;
        int duplicate1 =-1;
        int[] freq = new int[arr.length];
        for(int num : arr){
            freq[num]++;
        }

        for(int i=0 ;i<freq.length ; i++){
            if(freq[i]>1){
                duplicate1 = i;
            }
        }
        return duplicate1;
        
    }
    public static void main(String[] args) {
        int arr[] = {3, 1, 3, 4, 2};
        int duplicate1 = find(arr);
        System.out.println(duplicate1);
    }
}