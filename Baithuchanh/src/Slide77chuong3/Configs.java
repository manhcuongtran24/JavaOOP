package Slide77chuong3;

public class Configs {
    //  Cấu hình số lượng hình học 
    public static final int SO_LUONG_HINH_TOI_THIEU = 0;
    public static final int SO_LUONG_HINH_TOI_DA = 5;

    // Các cấu hình khác
    public static final float PI = 3.14f;
    public static final float INCH_CM = 2.54f;
    public static final int DON_VI_CM = 1;
    public static final int DON_VI_INC = 2;
    public static int donVi = DON_VI_CM;

    // Phương thức static chuyển đổi centimet sang inch
    public static float ChuyenCentimetSangInch (float cm) {
        float inch = cm / INCH_CM;
        return inch;
    }
    // Phương thức static giúp chuyển đồi inch sang centimet
    public static float ChuyenInchSangCentimet (float inch) {
        float cm = inch * INCH_CM;
        return cm;
    }
}
