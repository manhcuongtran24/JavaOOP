import java.util.LinkedList;
import java.util.Scanner;

public class Slide41chuong4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> linkedListString = new LinkedList<>();
        for(int i = 1; i <= 12; i++) {
            linkedListString.add("Thang " + i);
        }
        System.out.print("Nhap chi so cua phan tu can lay :");
        int index = sc.nextInt();
        if ((index < 0) && (index > (linkedListString.size()- 1))) 
            System.out.println("Chi so can lay phan lon hon 0 va nho hon" + (linkedListString.size() - 1));
            else {
                String node = linkedListString.get(index);
                System.out.println("Phan tu co chi so =" + index + "trong linkedList la:" + node);
            }
            String fistNode = linkedListString.getFirst();
            String lastNode = linkedListString.getLast();
            System.out.println("\nPhan tu dau tien trong danh sach la:" + fistNode + ";Phan tu cuoi trong danh sach la:" + lastNode);
    }
}
