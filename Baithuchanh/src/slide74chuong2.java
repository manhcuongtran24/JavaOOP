import java.util.Scanner;

/**
 * slide74chuong2
 */
public class slide74chuong2 {
 
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap so phan tu cua mang:");
            n = sc.nextInt();
        } while ( n < 0);
        int  [] Arr = new int[n];
        System.out.print("Nhap cac phan tu cho mang:");
        for (int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " +i +": ");
            Arr[i] = sc.nextInt();
        }
        double sum = 0;
        for ( int i = 0; i < n; i++) {
            if (Arr[i] % 2 == 0){
                sum += Arr[i]; 
            }
        }
        System.out.println("Tong:" +sum);

    }
}