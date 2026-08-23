class Solution {
    public boolean isBipartite(int[][] graph) {

        int n = graph.length;

        // -1 = not colored
        //  0 = color 0
        //  1 = color 1
        int[] color = new int[n];

        Arrays.fill(color, -1);

        for (int i = 0; i < n; i++){
            if (color[i] != -1){
                continue;
            }
            Queue<Integer> q = new LinkedList<>();
            color[i] = 0;
            q.add(i);
            while (!q.isEmpty()){
                int node = q.poll();
                for (int neighbor : graph[node]){
                    if (color[neighbor] == -1){
                        color[neighbor] = 1 - color[node];
                        q.add(neighbor);
                    }
                    else if (color[neighbor] == color[node]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}