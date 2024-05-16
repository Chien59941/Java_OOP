package SET;
import java.util.Set;
import java.util.LinkedHashSet;
public class LinkedHashSet1 {
    public static void main(String[] args) {
        Set<String> link_set = new LinkedHashSet<String>();
        link_set.add("Java");
        link_set.add("C++");
        link_set.add("Java");
        link_set.add("PHP");
        for (String str : link_set)
            System.out.println(str);
    }
}
