public class MyRunnable implements Runnable {
    private String threadName;

    public MyRunnable(String threadName) {
        this.threadName = threadName;
    }

    public String getThreadName() {
        return threadName;
    }

    @Override
    public void run() {
        System.out.println("Runnable: Thread is running...");
        for (int i = 0; i < 10; i++) {
            System.out.println(this.threadName + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Runnable: " + this.threadName + " Thread is done.");
    }
}
