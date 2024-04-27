package tencent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tencent03 {
    private static List<Integer>[] graph;
    private static boolean[] visited;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] e = new int[m][2];
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            e[i][0] = u;
            e[i][1] = v;
        }
        System.out.println(countgraph(n,e));
    }
    public static int countgraph(int n, int[][] e){
        graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int[] es:e){
            int u = es[0];
            int v = es[1];
            graph[u].add(v);
            graph[v].add(u);
        }
        visited = new boolean[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if(!visited[i]){
                //dfs(i);
                cnt++;
            }
        }
        return cnt;
    }
public void dfs(int n){
        visited[n] = true;

    for (int neighbor:graph[n]) {
        if (!visited[neighbor]){
            dfs(neighbor);
        }
    }
}
}
