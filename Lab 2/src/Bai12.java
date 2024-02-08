import java.util.Scanner;

/**
 * Bai12
 */
public class Bai12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.printf("nhap so hang cua ma tran: ");
            int hang = sc.nextInt();
            System.out.printf("nhap so cot cua ma tran: ");
            int cot = sc.nextInt();
            int[][] matran = new int[hang][cot];
            System.out.printf("nhap vao cac phan tu cho ma tran:");
            for(int i=0;i<hang;i++)
            for(int j=0;j<cot;j++)
            matran[i][j] = sc.nextInt();
            int max= matran[0][0];
            for(int i=0;i<hang;i++)
            for(int j=0;j<cot;j++)
            if(max < matran[i][j]) max = matran[i][j];
            System.out.println("phan tu lon nhat trong mang la: "+max);
    }
}