package MAP;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map;
public class Thay_The_gia_tri_treeSet {
    public static void main(String[] args) {
        TreeMap<Integer, Double> tree1 = new TreeMap<>();
        tree1.put(1, 9d);
        tree1.put(4, 10.1d);
        tree1.put(2, 7.2d);
        tree1.put(8, 20.28d);
        System.out.println("Cac phan tu trong tree1: ");
        Set<Map.Entry<Integer, Double>> settree = tree1.entrySet();
        System.out.println(settree);
        tree1.replace(4, 20.11d);
        tree1.replace(2, 7.2d, 7.7d);
        System.out.println("Cac phan tu co trong tree1 sau khi thay th: ");
        settree = tree1.entrySet();
        System.out.println(settree);
    }
}
