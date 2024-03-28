package person;

import java.util.Scanner;

import slide54chuong3.mainhinhhoc;

public class Person {
    public String ten;
    public int tuoi;
    public String gioitinh;
    public Person() {
        ten = "";
        tuoi = 0;
    }
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten =");
        ten = sc.nextLine();
        System.out.print("Tuoi =");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Gioi tinh:");
        gioitinh = sc.nextLine();
    }
    public void inThongTin() {
        System.out.println("Ho va ten:" +ten);
        System.out.println("Tuoi:" +tuoi);
        System.out.println("Gioi tinh:" +gioitinh );
    }
}

