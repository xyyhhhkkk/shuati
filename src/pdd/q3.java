package pdd;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t>0){
            int n = in.nextInt();
            int k = 0;
            int[] a = new int[1005];

            for (int i = 1; i <= n; i++) {
                a[i] = in.nextInt();
                k+=a[i];
            }
            int min1 = Integer.MAX_VALUE;
            int sum = 0;
            for (int i = 1; i*i <= k; i++) {
                if (k%i == 0){
                    int res = 0;
                    int cnt = 0;
                    int max1 = 0;
                    for (int j = 1; j <= n ; j++) {
                        res++;
                        cnt+=a[j];
                        if (cnt == k/i){
                            max1 = Math.max(max1,res);
                            res = 0;
                            cnt = 0;
                        }
                    }
                    if (cnt == 0 && max1<=min1){
                        sum = k/i;
                        min1 = max1;
                    }
                }
            }
            System.out.println(min1 + " " + sum);
        }
    }
}
