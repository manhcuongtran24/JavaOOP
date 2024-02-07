import java.util.Scanner;

/**
 * Bai11
 */
public class Bai11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, temp;
        do {
            System.out.print("Nhap so phan tu cua mang:");
            n = sc.nextInt();
        } while (n <= 0);
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("So phan thu" + (i+1) +"la:");
            A[i] = sc.nextInt();
        }
        System.out.print("Mang ban dau nhap:");
        for (int i = 0; i < n; i++){
            System.out.print(A[i]);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i] > A[j]) {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        System.out.println("\nMang sau khi sap xep la:");
        for (int i = 0; i < n; i++)
        System.out.print(A[i]);
    }
}