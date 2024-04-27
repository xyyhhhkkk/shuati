package basic;


import java.util.Scanner;

public class CalculateSqrt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(calculateSqrt(num));
    }

    public static int calculateSqrt(int num) {
        if(num<2){
            System.out.println("整数应该大于2");
            return 0;
        }
        else {
            return (int)Math.sqrt(num);
        }
    }

}
