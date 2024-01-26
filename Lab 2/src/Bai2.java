import java.util.Scanner;

/**
 * Bai2lab2
 */
import java.util.Scanner;
public class Bai2lab2 {

    public static void main(String[] args) {
        double a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a =");
        a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("a la so chan ! " );
        }
        if (a % 2 == 1) {
            System.out.println("a la so le !" );
        }

    }
}