/**
 * tintongcacsonguyen
 */
import java.util.Scanner;

import javax.xml.transform.stream.StreamResult;
public class tintongcacsonguyen {

    public static void main(String[] args) {
        int tong = 0, n;
        String StrResult = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap so nguyen bat ki:");
            n = sc.nextInt();
            tong += n;
            StrResult =StrResult + n +" + ";

        } while (tong <= 100);
        StrResult = StrResult.substring(0,StrResult.length()-2);
        System.out.println(StrResult + "= " + tong  );
    }
}