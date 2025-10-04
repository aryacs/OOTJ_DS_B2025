package CSE.DS.Comp.JavaCollection;
import java.util.HashMap;
import java.util.Map;
public class MapInterfaceExample {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Delhi");
        map.put(101, "Pune");
        map.put(102, "Mumbai");
        map.put(103, "Mumbai");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
