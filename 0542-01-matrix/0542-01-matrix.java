class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        Queue<int[]> q = new LinkedList<>();
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (mat[r][c] == 0) {
                    q.add(new int[]{r, c});
                } 
                else {
                    mat[r][c] = -1;
                }
            }
        }

        int[][] directions = {{1, 0},{-1, 0},{0, 1},{0, -1}};

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int r = current[0];
            int c = current[1];
            for (int[] dir : directions) {
                int newr = r + dir[0];
                int newc = c + dir[1];
                if (newr >= 0 && newc >= 0 && newr < row && newc < col && mat[newr][newc] == -1) {
                    mat[newr][newc] = mat[r][c] + 1;
                    q.add(new int[]{newr, newc});
                }
            }
        }
        return mat;
    }
}