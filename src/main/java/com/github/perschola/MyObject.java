package com.github.perschola;
/*Part 1: Write a Java program that starts two threads
        each thread will print the numbers from 1 - 4.
        While performing this task each thread will be at sleep for two seconds*/

//import org.jcp.xml.dsig.internal.SignerOutputStream;

import org.w3c.dom.ls.LSOutput;

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

  /**  Write a Java program that starts three threads
    each will take 1 second to print out each number from 1 - 5.
        However, the second and third thread must wait until the first thread finishes.
        Use sleep and join.*/