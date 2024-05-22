import java.util.Scanner;

public class CVC178Person {
    public String hoten;
    public int ma;
    public float diem;
    public void nhapthongtin()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap hoten: ");
        hoten = sc.nextLine();
        System.out.println("Nhap ma:");
        ma =sc.nextInt();
        System.out.println("Nhap diem: ");
        diem = sc.nextFloat();
    }
    public void inthongtin()
    {
        System.out.println("Ho ten: " + hoten + " Ma " + ma + " Diem " + diem );
    }
}