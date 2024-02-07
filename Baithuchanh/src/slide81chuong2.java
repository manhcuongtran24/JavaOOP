import java.util.Scanner;

/**
 * slide90chuong2
 */
public class slide90chuong2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang cua ma tran:");
        int hang = sc.nextInt();
        System.out.print("Nhap so cot cua ma tran:");
        int cot = sc.nextInt();
        int [][] matran = new int[hang][cot];
        System.out.print("Nhap cac phan tu cua ma tran: ");
        for (int i = 0; i < hang; i++){
            for (int j = 0; j < cot; j++ ) {
                 matran [i][j] = sc.nextInt();
            }
        }
        int max = matran[0][0];
        for ( int i = 0; i < hang; i++){
            for (int j = 0; j < cot; j++){
                if (max < matran[i][j]){ 
                    max = matran[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat trong ma tran la:" +max);

    }
}