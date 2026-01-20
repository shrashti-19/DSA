import java.util.*;

public class majority2{
    public static List<Integer> maj2(int nums[]){
        // int n = nums.length;
    
        // List<Integer> result = new ArrayList<>();
        // for(int i=0 ; i<n ; i++){
        //     //check if already added or not
        //     if(result.size() == 0 || result.get(0) != nums[i] && (result.size() < 2 || result.get(1) != nums[i])){
        //         int count = 0;
        //         for(int j=0 ; j<n ; j++){
        //             if(nums[i]==nums[j]){
        //                 count++;
        //             }
        //         }
        //         if(count>n/3){
        //             result.add(nums[i]);
        //         }
        //     }
        //     if(result.size()==2){
        //         break;
        //     }
        // }
        // return result;

        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        int cnd1=0, cnd2=0;
        int cnt1=0,cnt2=0;

        for(int x : nums){
            if(x == cnd1){
                cnt1++;
            }else if(x==cnd2){
                cnt2++;
            }else if(cnt1==0){
                cnd1=x;
                cnt1++;
            }else if(cnt2==0){
                cnd2 = x;
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }

        //verifying
        int cnt3=0, cnt4=0;
        for(int x :nums){
            if(x == cnd1){
                cnt3++;
            }
            if(x == cnd2){
                cnt4++;
            }
        }

        if(cnt3>n/3){
            result.add(cnd1);
        }
        if(cnt4>n/3 && cnd2!=cnd1){
            result.add(cnd2);
        }







        return result;


    }
    public static void main(String args[]){
        int arr[] = {0,0,0};
        List<Integer> ans  = maj2(arr);
        for(int num : ans){
            System.out.println(num + " ");
        }

    }
}