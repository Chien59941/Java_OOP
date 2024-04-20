package DoiTuong_Lop_Chuong_3;

import java.util.Scanner;

public class MainClass3 {
    public static void main(String[] args) {
        HinhTron3 ht3 = new HinhTron3();
        System.out.println(" Hay nhap vao ban kinh hinh tron: ");
        Scanner sc = new Scanner(System.in);
        float bk = sc.nextFloat();
        ht3.setBanKinh(bk);
        System.out.println("Nhap vao toa do hinh tron: ");
        System.out.println("x = ");
        ToaDo toaDo = new ToaDo();
        toaDo.x = sc.nextInt();
        System.out.println("y = ");
        toaDo.y = sc.nextInt();
        sc.close();
        ht3.setToaDo(toaDo);
        ht3.setToaDo(toaDo.x, toaDo.y);
        ht3.xuatBanKinh();
        ht3.xuatToaDo();
    }
}
