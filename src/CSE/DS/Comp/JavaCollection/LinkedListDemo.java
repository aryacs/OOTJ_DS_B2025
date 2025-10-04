package CSE.DS.Comp.JavaCollection;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(52);
        ll.add(45);
        ll.add(55);
        ll.add(58);
        ll.add(62);
        ll.addFirst(15);
        ll.add(2, 28);
        ll.addLast(85);
        System.out.println(ll);

    }
}
