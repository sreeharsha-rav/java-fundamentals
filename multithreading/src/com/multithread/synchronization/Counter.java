package com.multithread.synchronization;

// Class to create a thread and start counting, store each value in Storage class
public class Counter {
    
    private Thread t1;

    public void count(Storage storage) {
        // Create a thread to count
        this.t1 = new Thread(new Runnable() {
            // Start counting
            public void run() {
                for (int i = 0; i < 100; i++) {
                    synchronized (storage) { // Synchronize the storage object
                        int currentData = storage.getData();
                        storage.setData(currentData + 1); // Increment the data
                        storage.notify(); // Notify the waiting thread
                    }
                    System.out.println("Counter: " + storage.getData());
                    try {
                        Thread.sleep(2000); // Sleep for 2 second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        // Start the thread
        this.t1.start();
    }

    public Thread getT1() {
        return this.t1;
    }
}
