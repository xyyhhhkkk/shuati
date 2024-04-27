package xiecheng;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class combineArr {
    static int N = 5*1000000+10;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        boolean[] isprime = new boolean[N+1];
        List<Integer> primes = new ArrayList<>();
        for (int i = 0; i <= N  ; i++) {
            isprime[i] = true;
        }
        isprime[1] = false;
        for (int i = 2; i <= N; i++) {
            if(isprime[i]){
                primes.add(i);
                for (int prime : primes) {
                    if ((long) i * prime > N) break;
                    isprime[i*prime] = false;
                    if(i%prime == 0) break;
                }
            }
        }
        List<Integer> b = new ArrayList<>();
        int cnt = 0;
        for (int x : a) {
            if(x == 2 && !b.isEmpty() && isprime[x+b.get(b.size()-1)] && isprime[b.get(b.size()-1)]){
                b.set(b.size()-1,b.get(b.size()-1)+2);
                cnt++;
            }else {
                b.add(x);
            }
        }
        int i = 1;
        while(i<b.size()){
            if(isprime[b.get(i)] && isprime[b.get(i-1)]){
                cnt++;
                i++;
            }
            i++;
        }
        System.out.println(n-cnt);
    }

}
