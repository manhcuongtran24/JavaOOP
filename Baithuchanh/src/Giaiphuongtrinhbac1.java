/**
 * Giaiphuongtrinhbac1
 */

 import java.util.Scanner;
public class Giaiphuongtrinhbac1 {

    public static void main(String[] args) {
        double A,B,nghiemX;
        Scanner sc = new Scanner(System.in);
        System.out.print("A=");
        A = sc.nextDouble();
        System.out.print("B=");
        B = sc.nextDouble();
        if (A == 0){
            System.out.println("Không phải phương trinh bậc nhất!");
        }else {
            nghiemX = -B/A;
           System.out.println("Nghiệm của phương trình là :" + nghiemX);
        }

    }
}

