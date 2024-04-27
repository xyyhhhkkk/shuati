package mayi;

import java.util.Scanner;

//小苯看中了一件价值为p元的物品，他手里有1个打折券和1个立减券。
// 两种优惠券都可以用在物品上，且使用顺序也是任意的。
//        两种优惠券分别以整数x和y的方式给出。
//        打折券：如果当前物品价格为p，使用后，物品价格变为x*p/100上取整
//        立减券：如果当前物品价格为p，使用后，物品价格变为：max(0，p-y)。即物品价格立减y元，但最多减到0.
//        这件价值为p的物品最少可以花多少钱买到。
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int price1 = (int) Math.ceil(x * p / 100)+1; // 打折券后的价格
        int price2 = Math.max(0, p - y); // 立减券后的价格

        // 考虑不同顺序使用优惠券的情况
        int minPrice = Math.min(price1, price2);
        minPrice = Math.min(minPrice, Math.max(0, p - y));
        minPrice = Math.min(minPrice, (int) Math.ceil(x * minPrice / 100));

        System.out.println(minPrice);
    }
}
