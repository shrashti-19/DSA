public class matrixMedian{
    public static int medianOfMatrix(int[][]nums, int rowLength, int colsLength){
        int totalElement = rowLength*colsLength;
        int medianPosition = totalElement/2;

        int low = nums[0][0];
        int high = nums[0][colsLength-1];

        for(int i=0; i<rowLength ; i++){
            low = Math.min(low, nums[i][0]);
            high = Math.max(high, nums[i][colsLength-1]);
        }
        
        while(low<=high){
            int count =0;
            int mid = low +(high - low)/2;
            for(int i=0 ; i<rowLength ; i++){
                count+=upperBound(nums[i], mid);
            }
             if(count <= medianPosition){
               low = mid + 1;
            }else{
              high = mid - 1;
            }
        }
        return low;
    }
    public static int upperBound(int[]rows, int x){
        int low = 0;
        int high = rows.length-1;
        int ans = rows.length;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(rows[mid]>x){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[][] = {{1,3,5},
                        {2,6,9},
                        {3,6,9}
        };
        int m = nums.length;
        int n = nums[0].length;
        System.out.println("Median of row sorted matrix : " + medianOfMatrix(nums, m , n));
    }
}