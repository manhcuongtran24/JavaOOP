package Slide80chuong3;

public class NhanVienPartTime extends NhanVien {
    private int giolamViec;
    
    public NhanVienPartTime(String ten , int giolamViec ) {
        this.ten = ten;
        this.giolamViec = giolamViec;
    }
    @Override
    public String loaiNhanVien() {
        return "Nhân viên thời vụ";
    }
    public void tinhLuong() {
        luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * giolamViec;
    }
}
