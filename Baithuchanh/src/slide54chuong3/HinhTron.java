package slide54chuong3;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public float bk;
    public HinhTron() {
        ten = "Hinh Tron";
    }
    public void nhapBanKinh() {
        System.out.print("Ban kinh =");
        Scanner sc = new Scanner(System.in);
        bk = sc.nextFloat();
    }
    public void tinhChuVi() {
        cv = 2 * PI * bk;
    }
    public void tinhDienTich() {
        dt = PI * bk * bk;
    }
}
