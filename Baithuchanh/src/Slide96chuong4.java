import java.util.LinkedHashMap;
import java.util.Set;

import slide54chuong3.mainhinhhoc;

public class Slide96chuong4 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        linkedHashMap.put(1, "Java");
        linkedHashMap.put(3, "PHP");
        linkedHashMap.put(2, "Python");
        linkedHashMap.put(4, "C++");
        System.out.println("Before remove:");
        show(linkedHashMap);
        linkedHashMap.remove(2);
        System.out.println("After remove:");
        show(linkedHashMap);
    }
    public static void show(LinkedHashMap<Integer, String> linkedHashMap) {
        Set<Integer> keySet = linkedHashMap.keySet();
        for(Integer key : keySet) {
            System.out.println(key + " " + linkedHashMap.get(key));
        }
    }
}
