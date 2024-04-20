package Slide80chuong3;

public class NhanVienFullTime extends NhanVien {
    private int ngaylamthem;
    private int loaichucvu;
    public NhanVienFullTime(String ten) {
        this.ten = ten;
        this.ngaylamthem = ngaylamthem;
    }
    public void setLoaiChucVu(int loaichucvu) {
        this.loaichucvu = loaichucvu;
    }
    @Override
    public String loaiNhanVien() {
        return "Nhân viên toàn thời gian";
    }
    public void tinhLuong() {
        if (loaichucvu == 1) {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + Configs.LUONG_LAM_THEM_MOI_NGAY * ngaylamthem;
        } else if (loaichucvu == 2) {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + Configs.LUONG_LAM_THEM_MOI_NGAY * ngaylamthem;
        }
    }
}
