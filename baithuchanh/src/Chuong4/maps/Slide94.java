import java.util.LinkedHashMap;
import java.util.Map;

public class Slide94 {
    public static void main(String[] args) {
        LinkedHashMap<Integer , String> hMap = new LinkedHashMap<Integer , String>();
        hMap.put(100, "Mo");
        hMap.put(101, "Dia");
        hMap.put(102, "Chat");
        for(Map.Entry<Integer,String> m:hMap.entrySet())
            System.out.println(m.getKey()+"  "+m.getValue());
        System.out.println("Truoc khi xoa phuong thuc :" +hMap);
        System.out.println("sau khi xoa phuong thuc" +hMap);
    }
    
}