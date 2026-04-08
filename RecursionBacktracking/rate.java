import java.util.*;

public class rate{
    public static List<String> findPath(int[][]maze, int n){
        List<String> result = new ArrayList<>();
        int[][] visited = new int[n][n];
        if(maze[0][0]==1){
            solve(0,0,visited,maze,n,"",result);
        }
        return result;
    }

    public static void solve(int r, int c, int[][]visited, int[][]maze,int n, String path, List<String>result){
        if(r==n-1 && c==n-1){
            result.add(path);
            return;
        }
        visited[r][c]=1;
        //down
        if(isSafe(r+1,c,maze,n,visited)){
            solve(r+1, c, visited, maze, n, path+"D", result);
        }
        //left
        if(isSafe(r,c-1,maze,n,visited)){
            solve(r, c-1, visited, maze, n, path+"L", result);
        }
        //right
        if(isSafe(r,c+1,maze,n,visited)){
            solve(r, c+1, visited, maze, n, path+"R", result);
        }
        //up
        if(isSafe(r-1,c,maze,n,visited)){
            solve(r-1, c, visited, maze, n, path+"U", result);
        }

        //backtrack
        visited[r][c] = 0;

    }

    public static boolean isSafe(int r, int c, int[][]maze,int n,  int[][]visited){
        return r>=0 && r<n  && c>=0 && c<n && visited[r][c]==0 && maze[r][c]==1;
    }
    public static void main(String[] args) {
        int[][] maze = {
            {1,0,0,0},
            {1,1,0,1},
            {1,1,0,1},
            {0,1,1,1},
        };

        int n = maze.length;
        List<String> result = findPath(maze, n);
        for(String ans : result){
            System.out.print(ans + ",");
        }
        System.out.println("");
    }
}