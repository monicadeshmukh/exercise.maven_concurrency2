package com.github.perschola;
/*Part 1: Write a Java program that starts two threads
        each thread will print the numbers from 1 - 4.
        While performing this task each thread will be at sleep for two seconds*/

//import org.jcp.xml.dsig.internal.SignerOutputStream;

import java.util.stream.IntStream;

/**
 * Implemented By Monica Deshmukh
 */
public class MyObject implements Runnable {
    public void run() {
        // TODO
        IntStream.range(1,5).forEach(System.out::println);
        try {
            Thread.sleep(2*1000);
        }catch (InterruptedException e){
            System.out.println("Exception occurred: " + e);
        }
    }
}
