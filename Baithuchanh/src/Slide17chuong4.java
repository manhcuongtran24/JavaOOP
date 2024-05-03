import java.util.ArrayList;

public class Slide17chuong4 {
    public static void main(String[] args) {
        //Khai báo 1 ArrayList có kiểu String
        ArrayList<String> arrayListString = new ArrayList<>();
        //Thêm các phần tử sử dụng phương thức add()
        arrayListString.add("JAVA");
        arrayListString.add("PHP");
        arrayListString.add("C#");
        arrayListString.add("C++");
        //Duyệt theo kích thước của arrListString
        //Sử dụng vòng lặp for thông thường 
        //Phương thức arrListString.size() sẽ trả về số lượng phần tử của arrListString 
        //Sau đó lấy phần tử tại vị trí thứ i thông qua hàm get()
        //Sau đó hiển thị giá trị phần tử đó ra 
        System.out.println("Các phần tử trong arrListString là: ");
        for (int i = 0; i < arrayListString.size(); i++) {
            System.out.print(arrayListString.get(i) + "\t");
        }
    }
}
