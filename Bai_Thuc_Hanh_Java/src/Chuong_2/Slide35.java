package Chuong_2;
import java.util.Scanner;
public class Slide35 {
    public static void main(String[] args) {
    int a,b;
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap so thu nhat: ");
    a = sc.nextInt();
    System.out.println("Nhap so thu hai: ");
    b = sc.nextInt();
    sc.close();
    if( a > b)
        System.out.println("So nho nhat la " + b);
    else 
        System.out.println("So nho nhat la " + a);
    }
}

