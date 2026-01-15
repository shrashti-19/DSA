public class search2D{
    public static boolean search(int matrix[][], int target){
        // for(int row[] : matrix){
        //     for(int col : row){
        //         if(col == target){
        //             return true;
        //         }
        //     }
        // }

        // return false;

        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0;
        int high = rows*cols-1;

        while(low<=high){
            int mid = low +  (high-low)/2;
            int r = mid/cols;
            int c = mid%cols;

            if(matrix[r][c] == target) return true;
            else if(matrix[r][c]<target) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},{5,6,7,8}, {9,10,11,12}};
        System.out.println(search(matrix,4));
    }
}