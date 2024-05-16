import java.util.ArrayList;
import java.util.Scanner;

/**
 * Bai1lab4
 */
public class Bai1lab4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        System.out.println("Nhap so luong phan tu:");
        int n = sc.nextInt();
        //Nhập và thêm phần tử ArrayList
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i +": ");
            int number = sc.nextInt();
            arrayListInteger.add(number);
        }
        int max = arrayListInteger.get(0);
        for (int i =1; i < arrayListInteger.size(); i++) {
            if (arrayListInteger.get(i).compareTo(max) >0) {
                max = arrayListInteger.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong arrayList la: " + max);
        //Xóa số nguyên
        System.out.print("Nhap so nguyen can xoa: ");
        int number = sc.nextInt();

        if(arrayListInteger.contains(number)) {
            for(int i= 0; i< arrayListInteger.size(); i++)
                if(arrayListInteger.get(i) == number)
                    arrayListInteger.remove(i);
            System.out.println("Xoa du lieu thanh cong!");
            System.out.println(arrayListInteger);
            System.out.println();
        } else {
            System.out.println("Phan tu " + number + " khong ton tai");
        }
        // Sắp xếp dãy số 
        arrayListInteger.sort((o1,o2)->(o1-o2));
        System.out.println("Day so duoc sap xep la: " + arrayListInteger); 
    } 
}
