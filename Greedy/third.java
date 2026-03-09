import java.util.*;

public class third{
    public static int maxPairChain(int[][]pairs){
        int length = 1;
        Arrays.sort(pairs, Comparator.comparingInt(a->a[1]));
        int lastend = pairs[0][1];

        for(int i=1 ; i<pairs.length ; i++){
            if(pairs[i][0]>lastend){
                length++;
                lastend = pairs[i][1];
            }
        }
        return length;
    }
    public static void main(String[] args) {
        int pairs[][] = {{1,2},{7,8}, {4,5}};
        System.out.println("Length of chain : " + maxPairChain(pairs));
    }
}