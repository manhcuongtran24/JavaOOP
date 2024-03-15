import java.util.Scanner;
public class Student {

    
        public String name;
        public double dtb;
        public double diemToan;
        public double diemLy;
        public double diemHoa;
        void nhapThongTin(){
            System.out.println("Nhap thong tin sinh vien:");
            System.out.print("Nhap ho ten: ");
            Scanner sc = new Scanner(System.in);
            name = sc.nextLine();
            System.out.print("Nhap diem Toan =");
            diemToan = sc.nextDouble();
            System.out.print("Nhap diem Ly =");
            diemLy = sc.nextDouble();
            System.out.print("Nhap diem Hoa =");
            diemHoa = sc.nextDouble();
        }    
        void inThongTin() {
            System.out.println("Thong tin sinh vien:");
            System.out.println("Ho va ten:" +name);
            System.out.println("Diem toan =" +diemToan);
            System.out.println("Diem ly =" +diemLy);
            System.out.println("Diem hoa =" +diemHoa);
        }    
         void tinhDIemTrungBinh() {
            dtb = (diemToan + diemLy + diemHoa)/3;
         }
         void inDiemTrungBinh(){
            System.out.println("Diem trung binh =" +dtb);
         }
        
      public static void main(String[] args) {
        Student student = new Student();
        student.nhapThongTin();
        student.inThongTin();
        student.tinhDIemTrungBinh();
        student.inDiemTrungBinh();
      }  
    }
    
    
