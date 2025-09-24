package com.ds.multithreading;

public class ThreadPriorityDemo extends Thread {
    public void run(){
        System.out.println("Inside Main");
    }

    public static void main(String[] args) {
        ThreadPriorityDemo t1 = new ThreadPriorityDemo();
        ThreadPriorityDemo t2 = new ThreadPriorityDemo();
        ThreadPriorityDemo t3 = new ThreadPriorityDemo();
        t1.start();
        t2.start();
        t3.start();
        t1.setPriority(10);
        t2.setPriority(7);
        t3.setPriority(2);
        System.out.println("T1 Priority: " + t1.getPriority());
        System.out.println("T2 Priority: " + t2.getPriority());
        System.out.println("T3 Priority: " + t3.getPriority());
        System.out.println(Thread.currentThread().getName());
    }
}
