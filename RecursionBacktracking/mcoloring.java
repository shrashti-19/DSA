import java.util.*;

public class mcoloring{
    public static boolean graphColoring(boolean[][]graph, int m, int n){
        int[] color = new int[n]; //for checking the colors nodes are filled or not
        Arrays.fill(color, 0);
        if(solve(graph,color,m,n,0)) return true;
        return false;
    }

    public static boolean solve(boolean[][]graph, int[]color, int m, int n, int node){
        if(node==n) return true;
        //expooring colors
        for(int i=1 ; i<=m ; i++){
            if(isSafe(node,color,graph,m,n,i)){
                color[node]=i;
                if(solve(graph, color, m, n, node+1))return true;
                color[node] = 0;
            }
        }
        return false;
    }
    public static boolean isSafe(int node, int[]color, boolean[][]graph, int m, int n, int col){
        for(int k=0 ; k<n ; k++){
            if(k!=node && graph[k][node] && color[k]==col)return false;
        }
        return true;
    }
    public static void main(String args[]){
        int N = 4;  // Number of nodes
        int m = 3;  // Maximum number of colors

        // Create a sample graph with edges (0,1), (1,2), (2,3), (3,0), (0,2)
        boolean[][] graph = new boolean[101][101];
        graph[0][1] = graph[1][0] = true;
        graph[1][2] = graph[2][1] = true;
        graph[2][3] = graph[3][2] = true;
        graph[3][0] = graph[0][3] = true;
        graph[0][2] = graph[2][0] = true;

        // Output if the graph can be colored with at most m colors
        System.out.println(graphColoring(graph, m, N));
    }
}