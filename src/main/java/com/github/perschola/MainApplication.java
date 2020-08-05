package com.github.perschola;

public class MainApplication {
    public static void main(String[] args) throws InterruptedException {
        Runnable object1 = new MyObject();
        Thread thread1 = new Thread(object1);

        Runnable object2 = new MyObject();
        Thread thread2 = new Thread(object2);

        Runnable object3 = new MyObject();
        Thread thread3 = new Thread(object3);
        thread1.start();
        thread1.join();

        thread2.start();
        thread2.interrupt();
        thread3.start();
        thread3.interrupt();

        //thread1.notifyAll();
        //thread2.notifyAll();

        //myObject.run();
    }
}
