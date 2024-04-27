package daimasuixianglu;

import java.util.Scanner;

public class reverseWords_151 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        reverseWords(s);
    }
    public static String reverseWords(String s) {
        String[] strs = s.trim().split(" ");        // 删除首尾空格，分割字符串
        StringBuilder res = new StringBuilder();
        for (int i = strs.length - 1; i >= 0; i--) { // 倒序遍历单词列表
            if (strs[i].equals("")) continue;        // 遇到空单词则跳过
            res.append(strs[i] + " ");              // 将单词拼接至 StringBuilder
        }
        return res.toString().trim();               // 转化为字符串，删除尾部空格，并返回
    }
    }
