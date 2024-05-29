
package model;


public class PMT {
    private String maphieu;
    private String madg;
    private String ngaylap;
    private String hantra;

    public PMT() {
    }

    public PMT(String maphieu, String madg, String ngaylap, String hantra) {
        this.maphieu = maphieu;
        this.madg = madg;
        this.ngaylap = ngaylap;
        this.hantra = hantra;
    }

    public String getMaphieu() {
        return maphieu;
    }

    public void setMaphieu(String maphieu) {
        this.maphieu = maphieu;
    }

    public String getMadg() {
        return madg;
    }

    public void setMadg(String madg) {
        this.madg = madg;
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
