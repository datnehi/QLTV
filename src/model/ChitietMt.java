
package model;


public class ChitietMt {
    private String masach;
    private String maphieu;
    private String ngaytra;
    private String hientrangmuon;
    private String hientrangsau;

    public ChitietMt() {
    }

    public ChitietMt(String masach, String maphieu, String ngaytra, String hientrangmuon, String hientrangsau) {
        this.masach = masach;
        this.maphieu = maphieu;
        this.ngaytra = ngaytra;
        this.hientrangmuon = hientrangmuon;
        this.hientrangsau = hientrangsau;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getMaphieu() {
        return maphieu;
    }

    public void setMaphieu(String maphieu) {
        this.maphieu = maphieu;
    }

    public String getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(String ngaytra) {
        this.ngaytra = ngaytra;
    }

    public String getHientrangmuon() {
        return hientrangmuon;
    }

    public void setHientrangmuon(String hientrangmuon) {
        this.hientrangmuon = hientrangmuon;
    }

    public String getHientrangsau() {
        return hientrangsau;
    }

    public void setHientrangsau(String hientrangsau) {
        this.hientrangsau = hientrangsau;
    }
    
    
}
