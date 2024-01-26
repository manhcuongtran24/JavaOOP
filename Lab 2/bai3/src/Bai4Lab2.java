/**
 * Bai4Lab2
 */
import java.util.Scanner;
public class Bai4Lab2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên từ 1-12:");
        int sothang = sc.nextInt();
        String tenthang;
        switch (sothang) {
            case 1:
                tenthang = "Tháng 1";
                break;
            case 2:    
                tenthang = "Tháng 2";
                break;
            case 3:    
                tenthang = "Tháng 3";
                break;
            case 4:    
                tenthang = "Tháng 4";
                break;
            case 5:    
                tenthang = "Tháng 5";
                break;
            case 6:    
                tenthang = "Tháng 6";
                break;
            case 7:    
                tenthang = "Tháng 7";
                break;
            case 8:   
                tenthang = "Tháng 8";
                break;
            case 9:    
                tenthang = "Tháng 9";
                break;
            case 10:    
                tenthang = "Tháng 10";
                break;
            case 11:    
                tenthang = "Tháng 11";
                break;
            case 12:    
                tenthang = "Tháng 12";
                break;
            default:
                tenthang = "Số này không hợp lệ";
                break;
        }
        System.out.println("Tháng tương ứng với số" + sothang + "là" + tenthang);
        
    }
}