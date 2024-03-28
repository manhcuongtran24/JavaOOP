package slide54chuong3;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float chieuCao;
    public HinhTru (){
        ten = "Hinh Tru";
    }
    public void nhapChieuCao() {
        nhapBanKinh();
        System.out.print("Chieu Cao =");
        Scanner sc = new Scanner(System.in);
        chieuCao = sc.nextFloat();
    }
    public void tinhTheTich () {
        tt = dt * chieuCao;
    }
}
