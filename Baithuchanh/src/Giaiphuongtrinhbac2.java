/**
 * Giaiphuongtrinhbac2
 */
import java.util.Scanner;
public class Giaiphuongtrinhbac2 {

    public static void main(String[] args) {
        double A,B,C,D,X1,X2;
        Scanner sc = new Scanner(System.in);
        System.out.print("A=");
        A = sc.nextDouble();
        System.out.print("B=");
        B = sc.nextDouble();
        System.out.print("C=");
        C = sc.nextDouble();
        sc.close();
        if(A==0) {
            System.out.println("Không phải phương trình bậc 2!");
        } else {
            D = Math.pow(B,2) - 4*A*C;
            if (D < 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else if (D == 0 ){
                X1 = X2 = -B / (2 * A);
                System.out.println("Phương trình có nghiệm kép là:" + X1);
            } if (D > 0) {
                X1 = (-B + Math.sqrt(D)) / (2 * A);
                X2 = (-B - Math.sqrt(D)) / (2 * A);
                System.out.println("Phương trình có 2 nghiệm là" + "X1 = " + X1 + "&" + "X2 =" + X2);
                
            }
        }
        
    }
}
