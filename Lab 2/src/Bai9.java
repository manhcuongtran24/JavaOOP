import java.util.Scanner;

/**
 * Bai9
 */
public class Bai9 {

    public static void main(String[] args) {
        int dem = 0;
        String chuoi;
        char Kytu;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi bat ky:");
        chuoi = sc.nextLine();
        for (int i = 0; i < chuoi.length(); i++) {
            Kytu = chuoi.charAt(i);
            dem++;
        }
        System.out.println("So luong ky tu thuong, hoa va so trong chuoi la:" + dem);
    }
}