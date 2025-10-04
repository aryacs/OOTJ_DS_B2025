package CSE.DS.Comp.JavaCollection;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(15);
        hs.add(20);
        hs.add(21);
        hs.add(25);
        hs.add(25);
        System.out.println(hs);
    }
}
