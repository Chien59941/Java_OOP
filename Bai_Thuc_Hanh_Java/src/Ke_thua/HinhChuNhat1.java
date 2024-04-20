package Ke_thua;

public class HinhChuNhat1 extends Hinhhoc {
    public float dai;
    public float rong;
    public HinhChuNhat1()
    {
        ten = "Hinh chu nhat";
    }
    public HinhChuNhat1(float dai, float rong)
    {
        this.dai =dai;
        this.rong =rong;
    }
    public HinhChuNhat1(Float canh)
    {
        this(canh, canh);
    }
    public void tinhChuVi()
    {
        chuVi = 2*(dai+rong);
    }
    public void tinhDienTich()
    {
        dienTich = dai*rong;
    }
}
