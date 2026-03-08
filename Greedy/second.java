import java.util.*;

public class second{
     public static int findMinArrowShots(int[][] points) {
        int arrows = 1;
        //sorting by end

        Arrays.sort(points, Comparator.comparingInt(b->b[1]));

        int lastend = points[0][1];
        for(int i=1 ; i<points.length ; i++){
            if(lastend>=points[i][0]){
                continue;
            }else{
                arrows++;
                lastend = points[i][1];
            }
        }
        return arrows;
    }
    public static void main(String args[]){
        int balloons[][] = {{1,2},{3,4},{5,6},{7,8}};
        System.out.println("No of arrows required to shot the balloons " + findMinArrowShots(balloons) );
    }
}