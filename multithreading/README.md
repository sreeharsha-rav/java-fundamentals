## Multithreading

### Objective:
Explore multithreading concepts in Java through practical implementation.

### Problems:

**1. Thread Behavior and Methods:**
- **Description:** Create a class `MyThread` derived from the `Thread` class and override the `run` method. 
- **ThreadDemo:** Implement a class `ThreadDemo` with a `main` method. Create 2 objects of `MyThread` class and observe thread behavior.
- **Observation:** Create `MyThread` class by implementing the `Runnable` interface and observe thread behavior (`MyRunnable`).
- **Priorities and Methods:** Write a thread-based program to understand thread priorities (`PriorityDemo`) and the working of `sleep()`, `join()` methods (`SleepJoinDemo`).

**2. Synchronization and Inter-thread Communication:** - in com.multhreading.synchronization
- **Classes:** Implement three classes: `Storage`, `Counter`, and `Printer`.
    - `Storage`: Store an integer value.
    - `Counter`: Create a thread that counts from 0 and stores each value in the `Storage` class.
    - `Printer`: Create a thread that reads the value in the `Storage` class and prints it with suitable synchronization.
- **Inter-thread Communication:** Implement inter-thread communication using `wait()` and `notify()`.
- **Program Execution:** Write a program (`Main`) to create instances of the `Storage` class, and set up `Counter` and `Printer` objects to operate on it.

**3. Thread Implementation for Searching:** - in com.mutlithreading.search
- **Fruit Class:** Create a class `Fruit` with a private array `names[]` to store 5 fruit names. Implement a constructor to initialize this array with fruit names.
- **SearchFruitThread Class:** Implement a class `SearchFruitThread` to implement thread functionality. It should have a `Fruit` object reference. Implement the thread to search for a fruit name in the `names` array. If found, print "Fruit name Found"; otherwise, print "Fruit name Not Found".
- **ThreadDemo:** Create a class `ThreadDemo` with a `main` method. Create an object of the `Fruit` class. Then, create an object of the `SearchFruitThread` class and pass the fruit object as an argument to its constructor. Implement searching for a fruit name in the array through a thread.
