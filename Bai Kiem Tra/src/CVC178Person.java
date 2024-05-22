import java.util.Scanner;
import java.util.ArrayList;
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
    public static void them(ArrayList<CVC178Person> list)
    {   Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap n");
        n =sc.nextInt();
        for(int i = 0; i < n; i++ )
        {
            CVC178Person ps = new CVC178Person();
            ps.nhapthongtin();
            list.add(ps); 
        }
    }

    public void xoa (ArrayList<CVC178Person> list)
    {
        list.clear();
    }
    
    public void hienthi(ArrayList<CVC178Person> list)
    {
        for(int a = 0; a < list.size(); a++)
            System.out.println(list);
    }
}