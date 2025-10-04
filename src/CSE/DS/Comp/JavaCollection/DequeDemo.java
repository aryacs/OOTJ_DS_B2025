package CSE.DS.Comp.JavaCollection;
import java.util.ArrayDeque;
import java.util.Deque;
public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<String>();
        deque.offer("NIET");
        deque.offer("NGIT");
        deque.add("MIET");
        deque.offerFirst("jai");
        System.out.println("After offer First Traversal...");
        for(String s:deque){
            System.out.println(s);
        }
        deque.pollLast();
        System.out.println("After pollLast() Traversal...");
        for(String s:deque) {
            System.out.println(s);
        }
    }
}
