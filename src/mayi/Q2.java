package mayi;

import java.lang.Math;
import java.lang.String;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = scanner.nextLine();
        scanner.close();

        int count = countSplitWays(str);
        System.out.println(count);

    }

    public static int countSplitWays(String str) {
        int length = str.length();
        int count = 0;

        // 计算元音和辅音数量
        int vowelCount = countVowels(str);
        int consonantCount = length - vowelCount;

        // 遍历所有可能的切割位置
        for (int i = 1; i < length; i++) {
            int leftVowels = countVowels(str.substring(0, i));
            int leftConsonants = i - leftVowels;
            int rightVowels = vowelCount - leftVowels;
            int rightConsonants = consonantCount - leftConsonants;

            int leftDiff = Math.abs(leftVowels - leftConsonants);
            int rightDiff = Math.abs(rightVowels - rightConsonants);

            if (leftDiff == rightDiff) {
                count++;
            }
        }

        return count;
    }

    public static int countVowels(String str) {
        // 计算字符串中元音字母的数量
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(String.valueOf(str.charAt(i)))) {
                count++;
            }
        }

        return count;
    }
}
