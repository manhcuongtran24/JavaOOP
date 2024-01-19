/**
 * Bai1Lab2
 */
import java.util.Scanner;
public class Bai1Lab2 {

    public static void main(String[] args) {
        double tong,hieu,tich,thuong,chialaydu,a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a =");
        a = sc.nextDouble();
        System.out.print("Nhap b =");
        b = sc.nextDouble();
        tong = a + b;
        System.out.println("Tổng =" + tong);
        hieu = a - b;
        System.out.println("Hiệu =" + hieu);
        tich = a * b;
        System.out.println("Tích =" + tich);
        if (b == 0) {
            System.out.println("NULL!");

        } else {
            thuong = a / b;
            System.out.println("Thương =" + thuong);
            chialaydu = a % b;
            System.out.println("Chia lấy dư = " + chialaydu);
        }
        if (a > b){
            System.out.println("Ket qua la:" + a + ">" + b);
        } else if (a == b) {
            System.out.println("Ket qua la:" + a + "=" + b);
        } else {
            System.out.println("Ket qua la:" + a + "<" + b);
        }
        
    }
}
