import java.util.Scanner;

/**
 * slide16chuong3
 */
public class slide16chuong3 {
    public class HinhTron {
        final float PI = 3.14f;
        float r;
        float cv;
        float dt;
        void nhapBanKinh () {
            System.out.print("Hay nhap vao ban kinh hinh tron:");
            Scanner sc = new Scanner(System.in);
            r = sc.nextFloat();
        }
        void tinhChuVi () {
            cv = 2 * PI * r;
        }
        void tinhDienTich () {
            dt = PI * r * r;
        }
        void inChuVi () {
            System.out.println("Chu vi Hinh Tron:" + cv);
        }
        void inDienTich () {
            System.out.println("Dien tich Hinh Tron:" + dt);
        }
    }
    public static void main(String[] args) {
        HinhTron ht = new slide16chuong3().new HinhTron();
       ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();
    }
}