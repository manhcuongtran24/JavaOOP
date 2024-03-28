package slide54chuong3;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;
    public HinhChuNhat(){
        ten = "Hinh Chu Nhat";
    }
    public void nhapChieuDai() {
        System.out.print("Chieu dai =");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();
    }
    public void nhapChieuRong(){
        System.out.print("Chieu rong =");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
    }
    public void tinhChuVi() {
        cv = 2 * (dai + rong);
    }
    public void tinhDienTich() {
        dt = dai * rong;
    }
}
