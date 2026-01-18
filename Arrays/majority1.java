public class majority1{
    public static int maj(int nums[]){
        // int n = nums.length;
        // int[] freq = new int[n+1];

        // for(int num : nums){
        //     freq[num]++;
        // }

        // int majority = 0;
        // for(int i=0 ; i<n; i++){
        //     if(freq[i]>n/2){
        //         majority = i;
        //     }
        // }
        // return majority;
        int n = nums.length;
        int cnt = 0;
        int el = 0;

        for(int i=0 ; i<n ; i++){
            if(cnt==0){
                cnt++;
                el = nums[i];
            }else if(el == nums[i]){
                cnt++;
            }else{
                cnt--;
            }
        }

        //verifying the potential candidate
        int cnt1=0;
        for(int i=0 ; i<n ; i++){
            if(nums[i] == el){
                cnt1++;
            }
        }

        if(cnt1>n/2){
            return el;
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {3,2,3};

        System.out.println("Majority element is :  " + maj(nums));
    }
}