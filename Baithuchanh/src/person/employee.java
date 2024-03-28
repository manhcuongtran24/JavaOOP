package person;

import java.util.Scanner;

public class employee extends Person {
    public String vitri;
    public double luong = 20000;
    public String maID;
    Scanner sc = new Scanner(System.in);
    public employee() {
        maID = "";
        vitri = "";    
    }
    public void xuatvitri() {
        System.out.println("=====" + vitri + "=====");
    }
    public void inViTri(){
        System.out.println("Vi tri:" + vitri);
    }
    public void nhapThongTin () {
        super.nhapThongTin();
        System.out.print("ID nhan vien:");
        maID = sc.nextLine();
    }
    public void inThongTin () {
        super.inThongTin();
        System.out .println("ID nhan vien:" + maID);
        System.out .println("Luong:" + luong + "VND");
    }
}
