package hsp.exception;

import java.util.Scanner;

public class Exception03 {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            try {
                num = Integer.parseInt(sc.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数");
            }
        }
        System.out.println("你输入的值是："+ num);
    }

}
