package com.multithread.search;

public class ThreadDemo {
    public static void main(String[] args) {
        // Initialize Fruit object
        String[] names = {"Apple", "Banana", "Orange", "Grapes", "Pineapple"};
        Fruit fruit = new Fruit(names);

        // Create 3 SearchFruitThread objects
        SearchFruitThread t1 = new SearchFruitThread(fruit);
        SearchFruitThread t2 = new SearchFruitThread(fruit);
        SearchFruitThread t3 = new SearchFruitThread(fruit);

        // Call the search method
        t1.search("Apple");
        t2.search("Guava");
        t3.search("Pineapple");
    }
}
