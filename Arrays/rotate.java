// rotate array by 90 degree anticlockwise
public class rotate{
    public static void rotatematrix(int[][]matrix){
        //90 degree anticlockwise - transpose + reverse columns
        int n= matrix.length;
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse columns
        for(int j=0 ; j<n ; j++){
            int left = 0 , right = n-1;
            while(left<right){
                int temp = matrix[left][j];
                matrix[left][j] = matrix[right][j];
                matrix[right][j] = temp;
                left++;
                right--;
            }
        }
    }
    public static void print(int[][] matrix){
        System.out.println("Rotated matrix by anti clockwise 90 degrees");
        int n = matrix.length;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3}, {4,5,6},{7,8,9}};
        rotatematrix(matrix);
        print(matrix);
    }
}