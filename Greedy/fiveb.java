import java.util.*;

public class fiveb{
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n = g.length;
        int n1 = s.length;
        int i=0,j=0;
        int count = 0;
        while(i<n && j<n1){
            if(s[j]>=g[i]){
                count++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};

        System.out.println("maximum number of satisfied children : " + findContentChildren(g, s) );
    }
}