package Slide80chuong3;

public class MainNhanVien {
    public static void main(String[] args) {
        NhanVienFullTime sep = new NhanVienFullTime("Nguyen Van Sep");
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        NhanVienFullTime linh1 = new NhanVienFullTime("Nguyen Thi Linh", );
        linh1.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        NhanVienFullTime linh2 = new NhanVienFullTime("Tran Van Linh");
        linh2.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        NhanVienPartTime thoivu = new NhanVienPartTime("Luu Van Vu", 300);
        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoivu.tinhLuong();
        //xuất thông tin
        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoivu.xuatThongTin();
    }
}
