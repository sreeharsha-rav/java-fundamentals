public class ThreadDemo {
    public static void main(String[] args) {
        // Create a new thread using Thread class
        MyThread t1 = new MyThread();
        t1.setName("Thread 1");
        // Start the thread
        t1.start();

        // Create a new thread using Runnable interface
        MyRunnable r = new MyRunnable("Thread 2");
        Thread t2 = new Thread(r);
        // Start the thread
        t2.start();
    }
}
