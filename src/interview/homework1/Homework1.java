package interview.homework1;

import java.util.Random;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        thread1 thread1 = new thread1();
        thread2 thread2 = new thread2(thread1);
        new Thread(thread1).start();
        new Thread(thread2).start();

    }
}
class thread1 implements Runnable{
    private boolean loop = true;

    @Override
    public void run() {
        while(loop){
            System.out.println(Math.random()*100+1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void setLoop(boolean loop){
        this.loop = loop;
    }
}

class thread2 implements Runnable{
    private thread1 thread1;
    Scanner sc = new Scanner(System.in);

    public thread2(thread1 thread1){
        this.thread1 = thread1;
    }
    @Override
    public void run() {
        while(true){
            if(sc.next().equals("Q")){
                thread1.setLoop(false);
                break;
            }
        }
    }


}
