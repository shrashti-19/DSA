public class search2D{
    public static boolean search(int matrix[][], int target){
        for(int row[] : matrix){
            for(int col : row){
                if(col == target){
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},{5,6,7,8}, {9,10,11,12}};
        System.out.println(search(matrix,0));
    }
}