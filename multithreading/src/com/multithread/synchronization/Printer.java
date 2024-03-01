package com.multithread.synchronization;

// Class to create a thread, read and print the value from Storage class
public class Printer {
    private Thread t1;

    public void print(Storage storage) {
        // Create a thread to print
        this.t1 = new Thread(new Runnable() {
            // Start printing
            public void run() {
                while (true) {
                    synchronized (storage) { // Synchronize the storage object
                        try {
                            storage.wait(); // Wait for the data to be updated
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Printer: " + storage.getData());
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
