package daimasuixianglu.tanxin;

import java.util.Arrays;

public class findContentChildren_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gIndex = 0;
        int sIndex = 0;
        int cnt = 0;
        while(gIndex<g.length && sIndex<s.length){
            if(g[gIndex]<=s[sIndex]){
                cnt++;
                gIndex++;
                sIndex++;
            }
            else sIndex++;
        }
        return cnt;
    }
}
