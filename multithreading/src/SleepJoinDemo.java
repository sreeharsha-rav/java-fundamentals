public class SleepJoinDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable("Thread 1"));
        Thread t2 = new Thread(new MyRunnable("Thread 2"));

        t1.start();
        t2.start();

        try {
            // join thread 1 and thread 2
            t1.join();
            System.out.println("Main thread joined Thread 1.");
            System.out.println("===============================================");
            Thread.sleep(3000);
            t2.join();
            System.out.println("Main thread joined Thread 2.");
            System.out.println("===============================================");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Joined all threads. Main thread is running...");
        System.out.println("===============================================");
        System.out.println("Main thread tasks ...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        
        }
        System.out.println("===============================================");
        System.out.println("Main thread is done.");

    }
}
