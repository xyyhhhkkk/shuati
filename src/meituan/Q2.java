package meituan;

import java.util.Scanner;

//小美有一个长为 n 的字符串 s，她希望删除尽可能少的字符，使得字符串不含长度为偶数的回文子串.
//她想知道她最少要删除几个字符，请你帮帮她吧
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        System.out.println(deletePalindrome(s));
    }

    public static int deletePalindrome(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j < s.length(); j++) {
                if(isPalindrome(s.substring(i, j+1))){
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private static boolean isPalindrome(String substring) {
        for (int i = 0; i < substring.length()/2; i++) {
            if(substring.charAt(i)!= substring.charAt(substring.length()-1-i)){
                return false;
            }
        }
        return true;

    }

}
