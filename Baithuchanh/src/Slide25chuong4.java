import java.util.ArrayList;
import java.util.Scanner;

public class Slide25chuong4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Nhap phan tu cua mang ArrayList:");
        int n = sc.nextInt();
        for ( int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu" + i + ": ");
            number = sc.nextInt();
            arrListInteger.add(number);
        }
        //Tìm phần tử lớn nhất trong mảng sử dụng phương thức compareTo()
        //Giả sử phần tử lớn nhất là phần tử đầu tiên
        int max = arrListInteger.get(0);
        for (int i =1; i < arrListInteger.size(); i++) {
            if (arrListInteger.get(i).compareTo(max) > 0) {
                max = arrListInteger.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong arrListInteger =" + max);
    }
}
