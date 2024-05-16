import java.util.HashSet;
import java.util.Scanner;

public class Slide55chuong4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hashSetInteger = new HashSet<>();

        hashSetInteger.add(7);
        hashSetInteger.add(3);
        hashSetInteger.add(9);
        hashSetInteger.add(4);
        hashSetInteger.add(1);

        System.out.println("Cac phan tu co trong hashSetInteger:");
        System.out.println(hashSetInteger);
        System.out.print("Nhap phan tu can them vao: ");
        int number = sc.nextInt();

        if(!hashSetInteger.contains(number)) {
            hashSetInteger.add(number);
            System.out.println("Them thanh cong phan tu:" + number);
            System.out.println("Cac phan tu trong hashSetInteger sau khi them la :");
            System.out.println(hashSetInteger);
        }
        else {
            System.out.println("Phan tu " + number + " da ton tai ");
        }
    }
}
