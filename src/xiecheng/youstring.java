package xiecheng;

import java.util.Scanner;

public class youstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String sb = in.nextLine();
        int cnt = 0;
        for (int i = 0; i < sb.length()-1; i++) {
            System.out.println(sb.substring(i,i+2));
            if (sb.charAt(i) == 'y' && sb.charAt(i+1)=='u'){
                cnt++;
                i++;
            }
        }
        System.out.println(cnt);
    }
}
