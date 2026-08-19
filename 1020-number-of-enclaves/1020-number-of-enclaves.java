class Solution {
    public int numEnclaves(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        for(int r = 0;r<row;r++){
            if(grid[r][0]==1){
                dfs(grid,r,0);
            }
            if(grid[r][col-1]==1){
                dfs(grid,r,col-1);
            }
        }
        for(int c=0;c<col;c++){
            if(grid[0][c]==1){
                dfs(grid,0,c);
            }
            if(grid[row-1][c]==1){
                dfs(grid,row-1,c);
            }
        }
        int count =0;
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(grid[r][c]==1){
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(int[][] grid,int r,int c){
        if(r<0||c<0||r>=grid.length||c>=grid[0].length){
            return;
        }
        if(grid[r][c]==0){
            return;
        }
        grid[r][c]=0;
        dfs(grid,r+1,c);
        dfs(grid,r-1,c);
        dfs(grid,r,c+1);
        dfs(grid,r,c-1);
    }
}