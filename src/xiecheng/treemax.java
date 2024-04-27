package xiecheng;

import java.util.Arrays;
import java.util.Scanner;

public class treemax {
    static final int N = 1000010;
    static final int M = 1000010;
    static int n;
    static int[] h =new int[N];
    static int[] e = new int[M];
    static int[] ne = new int[M];
    static int index;
    static int[] p = new int[N];
    static int[] result = new int[N];
    static int g;
    static int[] dis = new int[N];
    static int[] st = new int[N];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        Arrays.fill(h,-1);
        int cnt = n;
        for (int i = 1; i <= n; i++) {
            p[i] = i;
        }
        for (int i = 1; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            if(find(a) != find(b)){
                p[find(a)] = p[find(b)];
                --cnt;
            }
            add(a,b);
            add(b,a);
        }
        dfs(1,-1,0);
        for (int i = 1; i <= n; i++) {
            if(dis[i] == mx){
                result[++g] = i;
            }
        }
        mx = -1;
        dfs2(rt,0,0);
    }

    public static void add(int a,int b){
        e[index] = b;
        ne[index] = h[a];
        h[a] = index++;
    }

    public static int find(int x){
        if(x!=p[x]){
            p[x] = find(p[x]);
        }
        return p[x];
    }
    static int rt;
    static int mx = -1;

    public static void dfs(int u , int fa, int dep){
        if(dep>mx) mx = dep;
        rt = u;
        dis[u] = dep;
        for (int i = h[u]; i != -1; i=ne[i]) {
            int v = e[i];
            if (i==fa){
                continue;
            }
            dfs(v,u,dep+1);
        }
    }

    public static void dfs2(int u,int fa,int dep){
        mx = Math.max(mx,dep);
        dis[u] = dep;
        for (int i = h[u]; i != -1 ; i = ne[i]) {
            int v = e[i];
            if(v ==fa){
                continue;
            }
            dfs2(v,u,dep+1);
        }
    }
}
