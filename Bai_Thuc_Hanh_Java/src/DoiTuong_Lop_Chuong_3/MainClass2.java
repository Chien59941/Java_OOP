package DoiTuong_Lop_Chuong_3;

public class MainClass2 {
    public static void main(String[] args) {
        HinhTron2 ht2 = new HinhTron2();
        ht2.nhapBK();
        if(ht2.VongTronLon())
        {System.out.println("Hinh tron co ban kinh " + ht2.setBanKinh());}
        else
        {   float chuvi = ht2.tinhChuVi();
            System.out.println("Chu vi hinh tron "+ chuvi);}
    }
}
