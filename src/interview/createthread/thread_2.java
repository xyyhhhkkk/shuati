package interview.createthread;

public class thread_2 implements Runnable{
    public static void main(String[] args) {
        Thread thread = new Thread(new thread_2());
//        thread_2 thread2 = new thread_2();  不能这样写，这跟方法调用没区别了
        thread.start();
//        thread2.run();        但是extend的时候可以，因为继承Thread类并覆盖run方法可以实现线程的创建和执行。
    }
    @Override
    public void run() {
        System.out.println("hello xyy2");
    }
}
