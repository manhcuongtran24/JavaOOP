import java.util.ArrayList;

public class Slide18chuong4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListIntegers = new ArrayList<>();
        arrayListIntegers.add(0);
        arrayListIntegers.add(7);
        arrayListIntegers.add(1);
        arrayListIntegers.add(9);
        //Sử dụng vòng for duyệt theo hướng đối tượng
        // Trong đó kiểu dữ liệu của biến number
        // phải trùng với kiểu dữ liệu của arrayListInteger
        System.out.println("Cac phan tu co trong arrayListInteger la: ");
        for (int number : arrayListIntegers) {
            System.out.println(number + "\t");
        }
    }
}
