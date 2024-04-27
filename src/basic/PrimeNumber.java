package basic;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println("是质数");

        }
        else {
            System.out.println("不是质数");
        }
    }
    public static boolean isPrime(int num){
        for (int i = 2; i < num/2; i ++ ) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
