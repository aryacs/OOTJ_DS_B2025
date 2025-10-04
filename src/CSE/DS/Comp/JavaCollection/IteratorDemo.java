package CSE.DS.Comp.JavaCollection;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDemo{
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();//Creating arraylist
            list.add(15);//Adding object in arraylist
            list.add(10);
            list.add(2,55);
            list.add(35);
            list.add(40);
            list.remove(1);

        System.out.println(list);

        }
    }

