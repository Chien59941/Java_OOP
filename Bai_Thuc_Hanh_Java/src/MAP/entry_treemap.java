package MAP;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map;
public class entry_treemap {
    public static void main(String[] args) {
        TreeMap<Integer, Character> tree = new TreeMap<>();
        tree.put(6, 'A');
        tree.put(5, 'B');
        tree.put(1, 'C');
        tree.put(2, 'D');
        tree.put(8, 'E');
        Set<Map.Entry<Integer,Character>> set_tree = tree.entrySet();
        System.out.println("Cac entry co trong  set_tree: ");
        System.out.println(set_tree);
    }
}
