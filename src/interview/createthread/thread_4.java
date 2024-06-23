package interview.createthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//线程池来创建
public class thread_4 implements Runnable {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new thread_4());
        executorService.execute(new thread_1());
    }

    @Override
    public void run() {
        System.out.println("xyy hhh");
    }
}
