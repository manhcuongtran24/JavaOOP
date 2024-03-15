import java.util.Scanner;

public class Employee {
    public String name;
    public int age;
    public double luong1ngay = 500000;
    public double tienluong;
    public int songaylam;
    void nhapThongTin(){
        System.out.println("Nhap thong tin sinh vien:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten:");
        name = sc.nextLine();
        System.out.print("Nhap tuoi:");
        age = sc.nextInt();
        System.out.print("Nhap so ngay lam:");
        songaylam = sc.nextInt();      
    }
    void inThongTin(){
        System.out.println("Thong tin sinh vien:");
        System.out.println("Ho ten:" +name);
        System.out.println("Tuoi:" +age);
        System.out.println("So ngay di lam:" +songaylam);
    }
    void tinhTienLuong(){
        tienluong = luong1ngay * songaylam;
    }
    void inTienLuong(){
        System.out.println("Tien luong nhan duoc la:" +tienluong);
    }
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.nhapThongTin();
        employee.inThongTin();
        employee.tinhTienLuong();
        employee.inTienLuong();
    }
}
