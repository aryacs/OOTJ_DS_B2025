package CSE.DS.Comp.JavaCollection;
import java.util.ArrayList;
import java.util.Collections;
public class SortCollection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Orange");
        list.add("Graps");
        list.add("Kiwi");
        System.out.println("Before" +list);
        Collections.sort(list);
        System.out.println("After" +list);
    }
}
