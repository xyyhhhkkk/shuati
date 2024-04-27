package basic;

import java.util.Scanner;

public class NumberPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(PasswordReverseNumber(num));
        DePasswordNumber(PasswordReverseNumber(num));
    }
    //加密
    public static String PasswordReverseNumber(int num) {
        StringBuilder str = new StringBuilder();
        for(char c : String.valueOf(num).toCharArray()) {
            int cnum = Integer.parseInt(String.valueOf(c));
            str.append(String.valueOf((cnum+5)%10));
        }
        return str.reverse().toString();
    }
    //解密
    public static void DePasswordNumber(String str) {
        StringBuilder s = new StringBuilder(str);
        StringBuilder s1 = new StringBuilder();
        s = s.reverse();
        for(char c : s.toString().toCharArray()) {
            int n = Integer.parseInt(String.valueOf(c));
            if (n<=4){
                n = n+10;
        }
            s1.append(n-5);
        }
        System.out.println(s1);
    }

}
