import java.util.Scanner;

public class CVC178Student extends CVC178Person {
    public float diemmongmuon;
    @Override
    public void nhapthongtin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem mong muon dat dc: ");
        diemmongmuon =sc.nextFloat();
    }
    public void inthongtin()
    {
        System.out.println("diem mong muon: " + diemmongmuon);
    }
    
}
