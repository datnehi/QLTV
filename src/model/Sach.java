
package model;

public class Sach {
    private String masach;
    private String tensach;
    private String tacgia;
    private String theloai;
    private String nhaxb;
    private String namxb;
    private String vitri;
    private String hientrangtruoc;
    private String trangthai;
    private String isdelete;
    
    public Sach(){
    }

    public Sach(String masach, String tensach, String tacgia, String theloai, String nhaxb, String namxb, String vitri, String hientrangtruoc) {
        this.masach = masach;
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.theloai = theloai;
        this.nhaxb = nhaxb;
        this.namxb = namxb;
        this.vitri = vitri;
        this.hientrangtruoc = hientrangtruoc;
    }

    

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getNhaxb() {
        return nhaxb;
    }

    public void setNhaxb(String nhaxb) {
        this.nhaxb = nhaxb;
    }

    public String getNamxb() {
        return namxb;
    }

    public void setNamxb(String namxb) {
        this.namxb = namxb;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getHientrangtruoc() {
        return hientrangtruoc;
    }

    public void setHientrangtruoc(String hientrangtruoc) {
        this.hientrangtruoc = hientrangtruoc;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }

    
}
