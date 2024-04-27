package huawei;

import java.util.Scanner;

public class pukepaixiaochu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        for (int i = 0; i <= s.length()-3; ) {
            if (s.substring(i,i+1).equals(s.substring(i+1,i+2))&&s.substring(i+1,i+2).equals(s.substring(i+2,i+3))){
                s = s.substring(0,i)+s.substring(i+3,s.length());
                if(i>1) i -=2;
                else i =0;
            }
            else i++;
        }
        if (s.equals("")){
            System.out.println(0);
        }
        else System.out.println(s);
    }

}
