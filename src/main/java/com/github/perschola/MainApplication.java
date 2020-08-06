package com.github.perschola;

public class MainApplication {
    public static void main(String[] args) throws InterruptedException {
      /*  Runnable object1 = new MyObject();
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
        thread3.interrupt();*/

        /************ Part3  ************************************/
       /* Runnable part3Object1 = new Part3();
        Thread part3Thread1 = new Thread(part3Object1);
        Runnable part3Object2 = new Part3();
        Thread part3Thread2 = new Thread(part3Object2);
        Runnable part3Object3 = new Part3();
        Thread part3Thread3 = new Thread(part3Object3);

        part3Thread1.start();
        part3Thread1.join();

        part3Thread2.start();
        part3Thread2.interrupt();
        part3Thread3.start();
        part3Thread3.interrupt();


        //thread1.notifyAll();
        //thread2.notifyAll();

        //myObject.run();
    }*/

        /*********** Part 4 ********************/
        Part4 part4Obj1 = new Part4();
        Part4 part4Obj2 = new Part4();
        Part4 part4Obj3 = new Part4();

        Thread part4Thread1 = new Thread(part4Obj1);
        Thread part4Thread2 = new Thread(part4Obj2);
        Thread part4Thread3 = new Thread(part4Obj3);

        part4Thread1.setPriority(Thread.MIN_PRIORITY);
        part4Thread2.setPriority(Thread.NORM_PRIORITY);
        part4Thread3.setPriority(Thread.MAX_PRIORITY);

        part4Thread1.start();
        part4Thread2.start();
        part4Thread3.start();
    }
}
