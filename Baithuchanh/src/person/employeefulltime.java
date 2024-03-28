package person;

import java.util.Scanner;

public class employeefulltime extends employee {
    public int ngaylamviec;
    public employeefulltime() {
        vitri = "Fulltime";
        ngaylamviec = 0;
    }
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Ngay lam viec:");
        ngaylamviec = sc.nextInt();
    }
    public void inThongTin () {
        super.inThongTin();
        System.out.println("So ngay lam viec:" + ngaylamviec);

    } 
    public void tinhluong() {
        luong = luong * ngaylamviec;
        if(ngaylamviec >= 25 && ngaylamviec <= 30) {
            luong = luong  + 200000;
        }else if (ngaylamviec > 30) {
            System.out.println("Thong tin khong hop le!");
        }
    }
}

