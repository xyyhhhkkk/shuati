package basic;

import javax.management.StringValueExp;

public class PassSeven {
    public static void main(String[] args) {

        int num = 100;
        passSeven(num);
    }

    public static void passSeven(int num){
        for (int i = 1; i < num+1; i++) {
            if (i % 7 ==0 || String.valueOf(i).contains("7")){              //这句话也可以改成if(i%10 == 7 || i/10%10 == 7 || i%7 == 0)
                System.out.print("过"+" ");
            }
            else {
                System.out.print(i+" ");
        }
    }
}}
