package xiecheng;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class resortArry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        Map<Integer,Integer> q = new HashMap<>();
        for (int j = 0; j < n; j++) {
            a[j] = in.nextInt();
            }
        for (int j = 0; j < n; j++) {
            b[j] = in.nextInt();
        }
        for (int j = 0; j < n; j++) {
            c[j] = in.nextInt();
            q.put(c[j],q.getOrDefault(c[j],0)+1);
            }
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int s = a[i] + b[i];
            if(q.containsKey(s) && q.get(s)>=1){
                q.put(s,q.get(s)-1);
                result++;
            }
        }
        System.out.println(resortarr(a,b,c));
        }
    public static int resortarr(int[] a, int[] b, int[] c){
        int[] sum = new int[a.length];
        String s = c.toString();
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            sum[i] = a[i] + b[i];
            String sumi = String.valueOf(sum[i]);
            if (s.contains(sumi)){
                if (s.indexOf(sumi) == 0){
                    s = s.substring(1,s.length());
                    result++;
                }
                else if (s.indexOf(sumi) == s.length()-1){
                    s = s.substring(0,s.length()-1);
                    result++;
                }
                else{
                    s = s.substring(0,s.indexOf(sumi))+s.substring(s.indexOf(sumi)+1,a.length);
                    result++;
                }
            }
        }
        return result;
    }


}

