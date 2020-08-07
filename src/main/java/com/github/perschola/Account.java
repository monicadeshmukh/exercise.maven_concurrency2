package com.github.perschola;
/**
 * Create a class named Account that represents a bank account.
 * This account starts with a balance of $50 and can be used only for withdrawals.
 * The withdrawal will be accepted even if there isn't enough money in the account to cover it.
 * The account simply reduces the balance by the amount you want to withdraw.
 */

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Implemented By Monica Deshmukh
 * 08/06/2020
 */
public  class  Account implements Runnable{
     public volatile static Long  balance = 50L;

    public  synchronized void withdraw () throws InterruptedException {
        Long amount = 10L;
        Boolean zeroBalance = false;
        ReadWriteLock lock = new ReentrantReadWriteLock();
        int counter = 5;
        while(!zeroBalance || counter !=0){
         if (balance >= amount) {
             lock.writeLock().lock();
             try {
                 System.out.println(Thread.currentThread().getName() + " is going to withdraw.");
                 balance -= amount;
                 System.out.println(Thread.currentThread().getName() + " completes the withdrawal.");
                 Thread.currentThread().sleep(100);
             }
             catch (InterruptedException e){
                 //Thread.currentThread().notifyAll();
             }
             finally {
                 lock.writeLock().unlock();
             }
        }
        else {
             System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw 0");
             zeroBalance = true;
         }
        counter--;
        }
    }

    @Override
    public void run() {
        try {
           withdraw();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
