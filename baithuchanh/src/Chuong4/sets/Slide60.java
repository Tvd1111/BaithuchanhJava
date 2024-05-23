import java.util.LinkedHashSet;
import java.util.Set;
public class Slide60 {
    public static void main(String[] args) {
        Set<String> linkedHashset=new LinkedHashSet<String>();
        linkedHashset.add("java");
        linkedHashset.add("c++");
        linkedHashset.add("java");
        linkedHashset.add("php");
        for(String str:linkedHashset){
            System.out.println(str);
        }
    }
}
