package interview.createthread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

// implement callable和extend Thread, implement Runnable的区别在于callable是可以返回参数的
public class thread_3 implements Callable<String> {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask = new FutureTask<>(new thread_3());
        Thread thread = new Thread(futureTask);
        thread.start();
        String result = futureTask.get();
        System.out.println(result);
    }

    @Override
    public String call() throws Exception {
        return "hello xyy";
    }
}
