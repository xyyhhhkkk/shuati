package interview.homework2;

import java.lang.management.ThreadInfo;

public class Homework2 {
    public static void main(String[] args) {
        cust cust = new cust();
        new Thread(cust).start();
        new Thread(cust).start();
    }
}

class cust implements Runnable{
    private static int total = 10000;
    @Override
    public void run() {
        while(true){
            synchronized(this){
                if(total>0){
                    total -= 1000;
                    System.out.println("用户"+ Thread.currentThread().getName()+"," + "还剩 : " + total );
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                else break;
            }
                }
    }
}