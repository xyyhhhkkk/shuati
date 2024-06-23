package interview.createthread;

public class thread_1 extends Thread {
    public static void main(String[] args) {
        thread_1 thread = new thread_1();
        thread.start();
    }

    public void run(){
        System.out.println("hello xyy");
    }
}
