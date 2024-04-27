package elema;

import java.util.Arrays;
import java.util.Scanner;

public class question01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = in.nextInt();
        }
        for(int j = 0; j<n; j++){
            b[j] = in.nextInt();
        }
    }
    public static int doublearr(int[] a, int[] b){
        int suma = 0;
        int sumb = 0;
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
            sumb += b[i];
        }
        if (suma>sumb){
            for (int i = 0; i < b.length; i++) {
                if(sumb+b[i] == suma){
                    cnt++;
                }
            }
        } else if (suma<sumb) {
            for (int i = 0; i < a.length; i++) {
                if(suma+a[i] == sumb){
                    cnt++;
                }
            }
        }
        return cnt;
    }

}
