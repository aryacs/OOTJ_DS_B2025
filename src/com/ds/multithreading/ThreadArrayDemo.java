package com.ds.multithreading;
class P extends Thread{
    public synchronized void run() {
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < 5; i++) {
            arr[i]= arr[i]*2;
            System.out.print(" " +arr[i]);
            try{Thread.sleep(500);}catch(Exception e){}
        }
        System.out.println();
    }
}
class Q extends Thread{
    public synchronized void run() {
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < 5; i++) {
            arr[i]= arr[i]+2;
            System.out.print(" " +arr[i]);
            try{Thread.sleep(500);}catch(Exception e){}
        }
        System.out.println();
    }
}
public class ThreadArrayDemo {
    public static void main(String[] args) {
        P t1 = new P();
        Q t2 = new Q();
        t1.start();
        try{Thread.sleep(1000);}catch(Exception e){}
        t2.start();
    }
}
