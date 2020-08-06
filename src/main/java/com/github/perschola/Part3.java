package com.github.perschola;
/**  Part 3:
 * Write a Java program that starts three threads
 each will take 1 second to print out each number from 1 - 5.
 However, the second and third thread must wait until the first thread finishes.
 Use sleep and join.
 Repeat the work done in question 2, however, this time give name to each thread.
 for e.g. Thread[My First Thread,5,main]*/
import java.util.stream.IntStream;

/**
 * Implemented By Monica Deshmukh
 * 8/5/2020
 */
import java.util.stream.IntStream;

public class Part3 implements Runnable{
   @Override
    public void run() {
       switch(Thread.currentThread().getName()){
           case("Thread-0"):
               System.out.println("Thread[ My First Thread,5,Main]");
               break;
           case("Thread-1"):
               System.out.println("Thread[ My Second Thread,5,Main]");
               break;
           case("Thread-2"):
               System.out.println("Thread[ My Third Thread,5,Main]");
               break;
       }
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

