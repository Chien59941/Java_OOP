package Ke_thua;

public class HinhTron1 {
    public final float PI =3.14f;
    public float bk;
    public float chuVi;
    public float dienTich;
    public HinhTron1(float bankinh)
    {
        this.bk = bankinh;
    }
    public void tinhChuVi()
    {
        chuVi = 2*PI*bk;
        System.out.println("Chu vi "+ chuVi);
    }
    public void tinhDienTich()
    {
        dienTich = PI*bk*bk;
        System.out.println("Dien tich "+ dienTich);
    }
    public void inHinhTron()
    {
        System.out.println(" Hinh tron ban kinh "+ this.bk);
        this.tinhChuVi();
        this.tinhDienTich();
    }
}
