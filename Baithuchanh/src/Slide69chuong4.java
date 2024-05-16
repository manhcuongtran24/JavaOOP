import java.util.Scanner;
import java.util.TreeSet;

public class Slide69chuong4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> treeSetStr = new TreeSet<>();
        treeSetStr.add("Toan");
        treeSetStr.add("Van");
        treeSetStr.add("Anh");
        treeSetStr.add("Hoa");

        System.out.println("Cac mon ho trong treeSetStr:");
        System.out.println(treeSetStr);
        System.out.print("Nhap mon hoc can them: ");
        String monhoc = sc.nextLine();

        if (!treeSetStr.contains(monhoc)) {
            treeSetStr.add(monhoc);
            System.out.println("Them thanh cong!");
            System.out.println("Cac mon hoc co trong treeSetStr sau khi them la: ");
            System.out.println(treeSetStr);
        }
        else {
            System.out.println("Mon " + monhoc + " da ton tai ");
        }
    }
}
