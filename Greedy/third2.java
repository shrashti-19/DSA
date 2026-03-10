import java.util.*;

public class third2{
    static class Job{
        int id;
        int deadline;
        int profit;

        public Job(int i, int d, int p){
            this.id = i;
            this.deadline = d;
            this.profit = p;
        }
    }
    public static int jobScheduling(Job jobs[], int n){

        //sorting by profit
        Arrays.sort(jobs, (a,b) -> b.profit - a.profit);
        int maxdeadline = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            maxdeadline = Math.max(maxdeadline, jobs[i].deadline);
        }

        boolean[] slots = new boolean[maxdeadline+1]; // because we are starting from 1
        int jobcount = 0, totalProfit = 0;
        for(int i=0 ; i<n ; i++){
            for(int j=jobs[i].deadline ; j>0 ;j--){ //slot 0 is not used
                 if(!slots[j]){
                    slots[j] =true;
                    jobcount++;
                    totalProfit+=jobs[i].profit;
                    break;
                 }
            }
        }

        return totalProfit;

    }
    public static void main(String args[]){
            Job jobs[] = new Job[]{
              new Job(1,4,20),
              new Job(2,1,10),
              new Job(3,2,40),
              new Job(4,2,30)
        };
        int n = 4;
        System.out.println("Total profit : " + jobScheduling(jobs, n));
        
    }
}