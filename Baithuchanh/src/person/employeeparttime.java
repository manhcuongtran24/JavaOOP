package person;

import java.util.Scanner;

public class employeeparttime extends employee{
    public int gio;
    Scanner sc = new Scanner(System.in);
    public employeeparttime() {
        vitri = "Parttime";
        gio = 0;
    }
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("So gio lam viec:");
        gio = sc.nextInt();
    }
    public void inThongTin () {
        super.inThongTin();

    }
    public void tinhluong() {
        luong = luong * gio;
    }
}
