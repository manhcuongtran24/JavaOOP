import java.util.Scanner;

/**
 * slide90chuong2
 */
public class slide90chuong2 {

    public static void main(String[] args) {
        char Kytu;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String chuoi = sc.nextLine();
        for (int i = 0; i < chuoi.length(); i++) {
            Kytu = chuoi.charAt(i);
            System.out.println(Kytu);
        }
    }
}