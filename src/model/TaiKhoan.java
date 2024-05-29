package model;

public class TaiKhoan {
    private String TenDangNhap;
    private String MatKhau;
    public TaiKhoan(){

    }
    public TaiKhoan(String TenDangNhap){
        this.TenDangNhap = TenDangNhap;
    }
    public TaiKhoan(String TenDangNhap, String MatKhau){
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }
    

}
