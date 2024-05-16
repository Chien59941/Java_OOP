package MAP;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class entry {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("CSLT ", " Co so lap trinh");    
        map1.put("C++ ", " C++");
        map1.put("C# ", " C Sharp");
        map1.put("PHP ", " PHP");
        map1.put("Java ", " Java");
        Set<Map.Entry<String, String>> set1 = map1.entrySet();
        System.out.println("Cac entry trong set: ");
        System.out.println(set1);  
    }
}
