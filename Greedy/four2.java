import java.util.*;

public class four2{
    static class Item{
        int value;
        int weight;

        public Item(int value, int weight){
            this.value = value;
            this.weight = weight;
        }
    }

    public static double fractionalKnapsack(Item[] items, int capacity){
        

        // we have to sort in such a way that items are also intact no lose of order.
        //Arrays.sort(items, Comparator.comparingDouble(item -> (double) item.value / item.weight).reversed());
        Arrays.sort(items, Comparator.comparingDouble((Item item) -> (double) item.value / item.weight).reversed());
        double totalvalue = 0;
    
        for(int i=0 ; i<items.length ; i++){
            if(capacity >=items[i].weight){
                totalvalue+=items[i].value;
                capacity-=items[i].weight;

            }else{
                totalvalue += ((double) items[i].value / items[i].weight) * capacity;
                break;
            }
        }
        return totalvalue;

    }
    public static void main(String[] args) {
        Item[] items = {
        new Item(60, 10),
        new Item(100, 20),
        new Item(120, 30)
    };

    int capacity = 50;

    double ans = fractionalKnapsack(items, capacity);
    System.out.println(ans);
    }
}