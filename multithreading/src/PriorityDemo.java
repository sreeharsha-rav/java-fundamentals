public class PriorityDemo {
    public static void main(String[] args) {  
        // Create threads  
        Thread t1 = new Thread(new MyRunnable("Thread 1: Min Priority"));
        Thread t2 = new Thread(new MyRunnable("Thread 2: Mid Priority"));
        Thread t3 = new Thread(new MyRunnable("Thread 3: Max Priority"));
        // Set Thread Priorities
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        // Start the threads
        t1.start();
        t2.start();
        t3.start();
    }
}
