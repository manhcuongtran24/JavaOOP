import java.util.Scanner;
/**
 * timsonhonhat
 */
import java.util.Scanner;
public class timsonhonhat {

    public static void main(String[] args) {
        int so1,so2,sonhonhat;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất:");
        so1 = sc.nextInt();
        System.out.print("Nhập số thứ 2:");
        so2 = sc.nextInt();
        sonhonhat = Math.min(so1, so2);
        System.out.println("Số nhỏ nhất trong hai số " + so1 + "và" + so2 + "là" +sonhonhat);
        
    }
}