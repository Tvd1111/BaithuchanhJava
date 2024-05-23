import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide88 {
    public static void main(String[] args) {
        HashMap<String,String> hashmapcity=new HashMap<>();
        hashmapcity.put("QNg","Quang Ngai");
        hashmapcity.put("QN","Quang Nam");
        hashmapcity.put("QN","Quang Ninh");
        hashmapcity.put("HCM","Thanh pho Ho Chi Minh");
        System.out.println("danh sach cac thanh pho trong hashmapcity:");
        Set<Map.Entry<String,String>>setcity=hashmapcity.entrySet();
        System.out.println(setcity);
        System.out.println("QNg"+hashmapcity.get("QNg"));
        System.out.println("NT"+hashmapcity.get("NT"));
        if(hashmapcity.containsValue("Thanh pho Ho Chi Minh")){
            System.out.println("co thanh pho Ho Chi Minh trong hashmapcity.");
        }
    }
    
}
