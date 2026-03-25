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
        return size;
    }
    public static void main(String args[]){
        int coins[] = {1,2,5,10,20,50};
        int amount = 87;
        System.out.println("Minimum number of coins need to cover the amount : " + coinChange(coins, amount));
    }
}