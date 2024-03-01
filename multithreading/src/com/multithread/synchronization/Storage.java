package com.multithread.synchronization;

// Class to store the data
public class Storage {
    private int data;

    public Storage(int data) {
        this.data = data;
    }

    public synchronized int getData() {
        return data;
    }

    public synchronized void setData(int data) {
        this.data = data;
    }
}
