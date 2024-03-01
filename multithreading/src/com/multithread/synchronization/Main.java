package com.multithread.synchronization;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage(0);
        Counter counter = new Counter();
        Printer printer = new Printer();

        // Call the print method
        printer.print(storage);
        // Call the count method
        counter.count(storage);

        // Join the threads
        try {
            counter.getT1().join();
            printer.getT1().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}
