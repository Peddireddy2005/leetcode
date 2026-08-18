class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oc = image[sr][sc];
        if(oc==color){
            return image;
        }
        dfs(image,oc,color,sr,sc);
        return image;
    }
    public void dfs(int[][] image, int oc,int color,int sr,int sc){
        int r = sr;
        int c = sc;
        if(r<0||r>=image.length||c<0||c>=image[0].length){
            return;
        }
        if(image[r][c] != oc){
            return;
        }
        image[r][c]=color;
        dfs(image,oc,color,r+1,c);
        dfs(image,oc,color,r-1,c);
        dfs(image,oc,color,r,c+1);
        dfs(image,oc,color,r,c-1);
    }
}