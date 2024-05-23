import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide86 {
    public static void main(String[] args) {
        HashMap<String,String> hashmap = new HashMap<>();
        hashmap.put("cslt","co so lap trinh");
        hashmap.put("c++","c++");
        hashmap.put("c#","c sharp");
        hashmap.put("php","php");
        hashmap.put("java","java");
        Set<Map.Entry<String,String>>setHashMap =hashmap.entrySet();
        System.out.println("cac entry co trong setHaahMap:");
        System.out.println(setHashMap);
    }
    
}
