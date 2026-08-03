class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] cand = new int[n];
        Arrays.fill(cand,1);
        for(int i=0;i<n-1;i++){
            if(ratings[i]<ratings[i+1]){
                cand[i+1] = cand[i]+1;
            }
        }
        for(int i=n-1;i>0;i--){
            if(ratings[i]<ratings[i-1]){
                cand[i-1] = Math.max(cand[i-1],cand[i]+1);
            }
        }
        int result=0;
        for(int i=0;i<n;i++){
            result += cand[i];
        }
        return result;
    }
}