public class five{
    public static int maxones(int arr[]){
        int length = 0;
        int maxlen = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==1){
                length++;
                maxlen = Math.max(length,maxlen);
            }else{
                length=0;
            }
        }
        return maxlen;
    }
    public static void main(String args[]){
        int arr[] = {1,1,0,1,1,1};
        System.out.println("Maximum consecutive ones : " + maxones(arr));
    }
}