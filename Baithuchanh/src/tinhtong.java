import java.util.Scanner;

/**
 * tinhtong
 */
import java.util.Scanner;
public class tinhtong {

    public static void main(String[] args) {
        int n, sodu, tong = 0;
        Scanner sc  = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên n bất kì:");
        n = sc.nextInt();
        while (n > 0){
            sodu = n % 10;
            n /=10;
            tong += sodu;
        }
        System.out.println("Tổng các chữ số =" + tong);

    }
}