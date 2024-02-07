import java.util.Scanner;

/**
 * Bai6
 */
public class Bai6 {

    public static void main(String[] args) {
        int n,i = 1;
        long giaithua = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so:");
        n = sc.nextInt();
        do {
            giaithua = giaithua*i;
            i++;
        } while (i <= n);
        System.out.println("Giai thua cua " + n + "bang" + giaithua);
    }
}