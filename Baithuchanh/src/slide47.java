import java.util.Scanner;

/**
 * slide47
 */
import java.util.Scanner;
public class slide47 {

    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap so nguyen:");
            n = sc.nextInt();
            sum += n;
        } while (sum <= 100);
        System.out.println("Tong cac so nguyen vua nhap = "+sum);
    }
}