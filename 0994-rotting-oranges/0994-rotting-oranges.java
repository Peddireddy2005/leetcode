class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int fresh = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int r =0;r<row;r++){
            for(int c =0;c<col;c++){
                if(grid[r][c]==2){
                    q.add(new int[]{r, c});
                }
                if(grid[r][c]==1){
                    fresh++;
                }
            }
        }
        int min = 0;
        while(!q.isEmpty() && fresh>0){
            int size = q.size();
            for(int i=0;i<size;i++){
            int[] current = q.poll();
            int r = current[0];
            int c = current[1];
            if(r-1>=0 && grid[r-1][c]==1){
                grid[r-1][c] =2;
                fresh--;
                q.add(new int[] {r-1,c});
            }
            if(c+1<col && grid[r][c+1]==1){
                grid[r][c+1] = 2;
                fresh--;
                q.add(new int[] {r,c+1});
            }
            if(r+1<row && grid[r+1][c]==1){
                grid[r+1][c] = 2;
                fresh--;
                q.add(new int[] {r+1,c});
            }
            if(c-1>=0 && grid[r][c-1]==1){
                grid[r][c-1] = 2;
                fresh--;
                q.add(new int[] {r,c-1});
            }
            }
            min++;
        }
        if(fresh>0){
            return -1;
        }
        return min;
    }
}