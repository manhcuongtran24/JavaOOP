package person;
import person.employeefulltime;
import person.employeeparttime;
public class runemployee {
    public static void main(String[] args) {
        employeefulltime full = new employeefulltime();
        full.xuatvitri();
        full.nhapThongTin();
        full.tinhluong();
        full.inThongTin();
        
        employeeparttime part = new employeeparttime();
        part.xuatvitri();
        part.nhapThongTin();
        part.tinhluong();
        part.inThongTin();
    }
}
