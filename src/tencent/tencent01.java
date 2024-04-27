package tencent;
import java.util.Arrays;
import java.util.Scanner;
/*输入例子：
        a,c,bb
        f,dddd
        nowcoder
        输出例子：
        a,bb,c
        dddd,f
        nowcoder*/
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split(",");
            Arrays.sort(words);

            StringBuilder sortedLine = new StringBuilder();
            for (int i = 0; i < words.length; i++) {
                sortedLine.append(words[i]);
                if (i < words.length - 1) {
                    sortedLine.append(",");
                }
            }
            System.out.println(sortedLine);
        }

        scanner.close();
    }
}
*/


public class tencent01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] point = new boolean[n];       //初始值全为false
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            String chr = sc.next();
            if (chr.equals("W")) {
                point[u-1] = true;
                point[v-1] = true;
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (point[i] == false){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}
