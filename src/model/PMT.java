
package model;


public class PMT {
    private String maphieu;
    private String masv;
    private String ngaylap;
    private String hantra;

    public PMT() {
    }

    public PMT(String maphieu, String masv, String ngaylap, String hantra) {
        this.maphieu = maphieu;
        this.masv = masv;
        this.ngaylap = ngaylap;
        this.hantra = hantra;
    }

    public String getMaphieu() {
        return maphieu;
    }

    public void setMaphieu(String maphieu) {
        this.maphieu = maphieu;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(String ngaylap) {
        this.ngaylap = ngaylap;
    }

    public String getHantra() {
        return hantra;
    }

    public void setHantra(String hantra) {
        this.hantra = hantra;
    }
    
    
}
