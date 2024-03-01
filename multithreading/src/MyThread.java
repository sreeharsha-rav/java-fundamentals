public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread: Thread is running...");
        String threadName = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            System.out.println(threadName + " "  + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread: " + threadName + " Thread is done.");
    }
}
