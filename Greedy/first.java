// n meeting in one room
import java.util.*;

public class first{
    public static List<Integer> meeting(int start[], int end[]){
       List<int[]> meetings = new ArrayList<>();
       for(int i=0 ; i<start.length ; i++){
         meetings.add(new int[]{start[i], end[i], i+1});
       }

       //sorting by end time
       meetings.sort(Comparator.comparingInt(b->b[1]));

       List<Integer> result = new ArrayList<>();
       int lastend = -1;
       for(int[]m : meetings){
         if(m[0]>lastend){
            result.add(m[2]);
            lastend = m[1];
         }
       }
       return result;

    }
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,5,7,9,9};

        List<Integer> ans = meeting(start, end);
        for(int a : ans){
            System.out.println(a);
        }
    }
    
}