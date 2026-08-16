class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vist = new boolean[n];
        int prov = 0;
        for(int i=0;i<n;i++){
            if(!vist[i]){
                prov++;
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                vist[i] = true;
                while(!q.isEmpty()){
                    int city = q.poll();
                    for (int j = 0; j < n; j++) {
                        if (isConnected[city][j] == 1 && !vist[j]) {
                            vist[j] = true;
                            q.add(j);
                        }
                    }
                }
                
            }
        }
        return prov;
    }
}