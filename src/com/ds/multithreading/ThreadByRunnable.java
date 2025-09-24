package com.ds.multithreading;
class A implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}
class B implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}
public class ThreadByRunnable {
    public static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();
        Thread t1 = new Thread(obj1, "Thread1");
        //System.out.println("Thread: ", + Thread.getName());
        Thread t2 = new Thread(obj2, "Thread2");
        t1.start();
        System.out.println(t1.isAlive());
        try{Thread.sleep(50);}catch(Exception e){}
        t2.start();
        System.out.println(t2.isAlive());
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
    }
}
