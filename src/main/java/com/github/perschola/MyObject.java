package com.github.perschola;
/**  Part 2:
 * Write a Java program that starts three threads
 each will take 1 second to print out each number from 1 - 5.
 However, the second and third thread must wait until the first thread finishes.
 Use sleep and join.*/
import java.util.stream.IntStream;

/**
 * Implemented By Monica Deshmukh
 */
 public class  MyObject implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread[ Thread-" + Thread.currentThread().getName() + ",5,Main]");
        IntStream.rangeClosed(1, 5).forEach(System.out::println);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            if (Thread.currentThread().getName().equals(1) || Thread.currentThread().getName().equals(2))
                Thread.currentThread().notifyAll();
           // e.printStackTrace();
        }
    }
}

