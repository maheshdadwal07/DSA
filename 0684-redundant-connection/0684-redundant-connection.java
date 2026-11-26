class Solution {
    
public int[] findRedundantConnection(int[][] edges) {
    int n = edges.length;
    int[] parent = new int[n + 1];
    int[] rank = new int[n + 1];
    for (int i = 1; i <= n; i++) {
        parent[i] = i;
    }
    for (int[] edge : edges) {
        int u = edge[0];
        int v = edge[1];
        int pu = find(parent, u);
        int pv = find(parent, v);
        if (pu == pv) {
            return edge;
        }
        if (rank[pu] < rank[pv]) {
            parent[pu] = pv;
        } 
        else if (rank[pu] > rank[pv]) {
            parent[pv] = pu;
        } 
        else {
            parent[pv] = pu;
            rank[pu]++;
        }
    }
    return new int[0];
}

private int find(int[] parent, int x) {
    if (parent[x] != x) {
        parent[x] = find(parent, parent[x]);
    }
    return parent[x];
}

}