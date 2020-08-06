
package com.github.perschola;

import java.util.stream.Stream;

/*Write a program that assigns priority to three threads (MIN_PRIORITY, NORM_PRIORITY, MAX_PRIORITY)
 and starts all threads. Each will take 2 seconds to print out the thread name,
 it's priority and a line separator. This task will happen 3 times.

 */
public class Part4 implements Runnable{
    @Override
    public void run() {
        int count = 3;
        while (count > 0) {
            System.out.println("Running thread's name is " + Thread.currentThread().getName());
            System.out.println("Running thread's priority is " + Thread.currentThread().getPriority());
            System.out.println("=================================================");
            try {
                Thread.currentThread().sleep(2 * 1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException occured");
                e.printStackTrace();
            }
            count--;
        }
    }
}
