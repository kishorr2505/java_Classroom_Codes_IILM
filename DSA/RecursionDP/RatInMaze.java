


class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {

        ArrayList<String> path = new ArrayList<>();
        String str = "";
        int n = maze.length;
        if (n == 0 || maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            return path;
        }

        addPaths(maze,0,0,n ,path, str);
        return path;
    }
    public static void addPaths(int [][]maze, int i, int j, int n,ArrayList<String>path, String str){
         
         if(i>=n || j>=n || i<0 || j<0||  maze[i][j]==0)return;
         
         if(i==n-1 && j==n-1) {
             path.add(str);
             return;
         }
         
         
         maze[i][j] = 0;
         addPaths(maze,  i+1,  j,  n, path, str+"D");
         addPaths(maze, i,j-1,n, path, str+"L");
         addPaths(maze,  i,  j+1,  n, path, str+"R");
         addPaths(maze, i-1,j,n, path, str+"U");
         
         
         maze[i][j] = 1;
         
         
         
    }
    
    
}