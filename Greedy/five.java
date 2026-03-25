import java.util.*;

public class five{
    public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins); 
        int size = 0;
        for(int i=coins.length-1 ; i>=0 ; i--){
             while(coins[i]<=amount){
                size++;
                amount-=coins[i];
             }
             if(amount==0) break;
        }
        if(amount!=0) return -1;
        return size;
    }
    public static void main(String args[]){
        int coins[] = {2};
        int amount = 3;
        System.out.println("Minimum number of coins need to cover the amount : " + coinChange(coins, amount));
    }
}