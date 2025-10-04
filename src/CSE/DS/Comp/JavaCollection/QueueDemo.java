package CSE.DS.Comp.JavaCollection;
import java.util.*;
class QueueDemo {
    public static void main(String args[]) {
        PriorityQueue<String> pQueue = new PriorityQueue<String>();
        pQueue.add("C");
        pQueue.add("C++");
        pQueue.add("Java");
        pQueue.add("Python");
        System.out.println("Head value using peek function:" + pQueue.peek());
        System.out.println("The queue elements:");
        System.out.println(pQueue); pQueue.poll();
        System.out.println("After removing an element" + "with poll function:");
        System.out.println(pQueue);
        pQueue.remove("Java");
        System.out.println("after removing Java with" + " remove function:");
        System.out.println(pQueue);
        boolean b = pQueue.contains("C");
        System.out.println ( "Priority queue contains C " + "or not?: " + b);
    } }

