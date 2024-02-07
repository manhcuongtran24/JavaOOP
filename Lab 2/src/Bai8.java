import java.util.Scanner;

/**
 * Bai8
 */
public class Bai8 {

    public static void main(String[] args) {
       int n;
       float tbc, sum = 0;
       Scanner sc = new Scanner(System.in); 
       do {
        System.out.print("Nhap so phan tu cua day:");
        n = sc.nextInt();
       } while (n <= 0);
       int A[] = new int[n];
       for (int i = 0; i < n; i++) {
        System.out.print("Nhap so thu "+(i + 1)+": ");
        A[i] = sc.nextInt();
        sum += A[i];
       }
       tbc = sum/n;
       System.out.println("Trung binh cong =" + tbc);
    }
}