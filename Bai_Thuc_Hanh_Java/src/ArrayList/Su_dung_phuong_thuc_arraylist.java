package ArrayList;

import java.util.ArrayList;

public class Su_dung_phuong_thuc_arraylist {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>(3);
        color.add("Red");
        color.add("Blue");
        color.add("Green");
        color.add("Orange");
        color.add("Green");
        color.add("Pink");
        color.add("Yellow");

        System.out.println(color.get(1));
        System.out.println(color.contains("Orange"));
        System.out.println(color.size());
        System.out.println(color);
    }
}
