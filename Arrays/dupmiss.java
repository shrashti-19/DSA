

public class dupmiss{
    public static int[] find(int grid[][]){
        
        // boolean[] bool = new boolean[nums.length+1];
        // ArrayList<Integer> result = new ArrayList<>();
        // for(int i : nums){
        //     if(bool[i]){
        //         result.add(i);
        //     }
        //     bool[i] = true;
        // }

        // for(int i=1 ; i <bool.length ;i++){
        //     if(!bool[i]){
        //         result.add(i);
        //     }
            
        // }
        // int[] ans = new int[result.size()];
        // for(int i=0 ; i<result.size() ; i++){
        //     ans[i] = result.get(i);
        // }
        // return ans;
        int  n = grid.length;
        int repeated = -1, missing = -1;

        boolean[] bool = new boolean[n*n+1];

        for(int[] row : grid){
            for(int i : row){
                if(bool[i]){
                    repeated = i;
                }
                bool[i] =true;
            }
        }

        for(int i=1 ; i<=n*n ; i++){
            if(!bool[i]){
                missing = i;
                break;
            }
        }

        return new int[]{repeated, missing};
    }
    public static void main(String args[]){
        int[][] nums = {
           {1, 2},
           {3, 3}
         };

        int[] array = find(nums);

        for (int x : array) {
            System.out.print(x + " ");
        }

    }
}