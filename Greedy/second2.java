
import java.util.*;


public class second2{
    public static int minimumPlatform(int arr[] , int dept[]){
        int maxplatform = 0;
        int platform = 0;
        int i=0,j=0;
        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dept);

        while(i<n && j<n){
            if(arr[i]<=dept[j]){
                platform++;
                i++;
            }else{
                platform--;
                j++;
            }
            maxplatform = Math.max(platform, maxplatform);
        }
        return maxplatform;
    }
    public static void main(String args[]){
        int arr[] = {900, 945, 955, 1100, 1500, 1800};
        int dep[] = {920, 1200, 1130, 1150, 1900, 2000};

        System.out.println(minimumPlatform(arr,dep));
    }
}