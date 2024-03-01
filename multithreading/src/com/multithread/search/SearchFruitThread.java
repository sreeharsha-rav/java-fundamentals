package com.multithread.search;

public class SearchFruitThread {
    private Fruit fruit;

    public SearchFruitThread(Fruit fruit) {
        this.fruit = fruit;
    }

    public void search(String target) {
        Thread searchThread = new Thread(new Runnable() {
            public void run() {
                for (String name : fruit.getNames()) {
                    if (name.equals(target)) {
                        System.out.println("Found: " + target);
                        return;
                    }
                }
                System.out.println("Not found: " + target);
            }
        });
        searchThread.start();
    }
}
