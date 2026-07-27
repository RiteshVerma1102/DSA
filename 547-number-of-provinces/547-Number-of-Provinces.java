class Solution {
    public int findCircleNum(int[][] c) {
        int n = c.length, count = 0;
        boolean[] vis = new boolean[n];

        for(int i = 0; i< n; i++){
            if(!vis[i]){
                dfs(c, vis, i);
                count++;
            }
        }
        return count;

    }
    void dfs(int[][] c, boolean[] vis, int node){
    vis[node] = true;
    for(int i =0; i < c.length;i++){
        if(c[node][i] == 1 && !vis[i]){
            dfs(c,vis,i);
        }
    }
    }
}