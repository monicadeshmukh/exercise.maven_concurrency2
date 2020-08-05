package com.github.perschola;

public class MainApplication {
    public static void main(String[] args) throws InterruptedException {
        //Runnable myObject = new MyObject();
        Thread thread1 = new Thread(new MyObject());
        Thread thread2 = new Thread(new MyObject());

        thread1.start();
        thread2.start();
        //myObject.run();
    }
}
