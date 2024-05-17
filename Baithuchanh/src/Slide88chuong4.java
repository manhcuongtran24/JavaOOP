import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide88chuong4 {
    public static void main(String[] args) {
        HashMap<String, String> hashMapCity = new HashMap<>();
        hashMapCity.put("ND", "Nam Dinh");
        hashMapCity.put("HN", "HN");
        hashMapCity.put("HN", "Ha Nam");
        hashMapCity.put("DN", "Thanh pho Da Nang");
        System.out.println("Danh sach cac thanh pho co trong hashMapCity:");
        Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity );
        
        System.out.println("ND: " + hashMapCity.get("ND"));

        System.out.println("BD: " + hashMapCity.get("BD"));
        if (hashMapCity.containsValue("HN")) {
            System.out.println("Co thanh pho Da Nang trong hashMapCity");
        }
    }
}
