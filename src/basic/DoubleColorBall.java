package basic;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DoubleColorBall {
    public static void main(String[] args) {
        verifyResult(customerArray(),winningArray());
    }

    public static int[] customerArray() {
        Scanner sc = new Scanner(System.in);
        int[] customerArr = new int[7];
        for (int i = 0; i < customerArr.length-1; ) {
            System.out.println("请输入第"+ (i+1) +"个红球的号码");
            int num = sc.nextInt();
            if (num > 0 && num <34){
                customerArr[i] = num;
                i++;
            }
            else{
                System.out.println("请输入正确的红球号码");
            }
        }

        while(true){
            System.out.println("请输入蓝球的号码");
            int blueNum = sc.nextInt();
            if(blueNum>0 && blueNum<17){
                customerArr[customerArr.length-1] = blueNum;
                break;
            }
            else{
                System.out.println("请输入正确的蓝球号码");
            }
        }
        System.out.println(Arrays.toString(customerArr));
        return customerArr;
    }

    public static int[] winningArray() {
        Random random = new Random();
        int[] winningArr = new int[7];
        for (int i = 0; i < winningArr.length-1; i++) {
            winningArr[i] = random.nextInt(33);
        }
        winningArr[winningArr.length-1] = random.nextInt(16);
        return winningArr;
    }

    public static void verifyResult(int[] carr,int[] warr) {
        int cnt = 0;
        boolean isblue = false;
        for (int i = 0; i < carr.length-1; i++) {
            for (int j = 0; j < warr.length-1; j++) {
                if (carr[i] == warr[j]) {
                    cnt++;
                    break;
                }
            }
        }
        if (carr[carr.length-1] == warr[warr.length-1]){
            isblue = true;
        }
        if (cnt == 6 && isblue){
            System.out.println("最高1000万");
        } else if (cnt == 6 && !isblue){
            System.out.println("最高500万");
        } else if (cnt == 5 &&isblue){
            System.out.println("3000元");
        } else{
            System.out.println("无");
        }
        System.out.println(Arrays.toString(winningArray()));
    }
}
