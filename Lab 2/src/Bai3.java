import java.util.Scanner;

/**
 * Bai3Lab2
 */
import java.util.Scanner;
public class Bai3Lab2 {

    public static void main(String[] args) {
        int tuoi,namsinh;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên:");
        String ten = sc.nextLine();
        System.out.print("Nhập năm sinh:");
        namsinh = sc.nextInt();
        int namhientai = 2024;
        tuoi = namhientai - namsinh;
        System.out.println("Tên:" + ten);
        System.out.println("Tuổi" + tuoi);
       if (tuoi < 16){
        System.out.println("Bạn" + ten + "còn là trẻ trâu.");
       } else if (tuoi >= 16 && tuoi < 18){
        System.out.println("Bạn" + ten + "ở đổ tuổi trưởng thành.");
       } else {
        System.out.println("Bạn" + ten + "đã già.");
       }
    }
}