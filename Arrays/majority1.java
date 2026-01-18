public class majority1{
    public static int maj(int nums[]){
        int n = nums.length;
        int[] freq = new int[n+1];

        for(int num : nums){
            freq[num]++;
        }

        int majority = 0;
        for(int i=0 ; i<n; i++){
            if(freq[i]>n/2){
                majority = i;
            }
        }
        return majority;
    }
    public static void main(String args[]){
        int nums[] = {3,2,3};

        System.out.println("Majority element is :  " + maj(nums));
    }
}