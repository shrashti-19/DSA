
import java.util.*;

public class first1{
    public static int eraseOverlapIntervals(int[][] intervals){
        Arrays.sort(intervals, Comparator.comparingInt(b->b[1])); //end time sorting

        int lastend = intervals[0][1];
        int removed = 0;
        
        for(int i=1 ; i<intervals.length ; i++){
            if(lastend > intervals[i][0]){
                removed++;
            }
            lastend = intervals[i][1];
        }

        return removed;
        
    }
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        System.out.print("The minimum number of interval getting removed : " +eraseOverlapIntervals(intervals) );
    }
}