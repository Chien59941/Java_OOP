import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        int n, s = 0;
        String StrResuat = "";
        Scanner sc = new Scanner(System.in);
        while (s <= 100) {
            System.out.println("Nhap vao so nguyen bat ky: ");
            n = sc.nextInt();
            s = s + n;
            StrResuat = StrResuat + n + " + ";
        }
        sc.close();
        System.out.println(StrResuat.substring(0, StrResuat.length()-2) + "= " + s);
    }
}
