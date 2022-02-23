package tuan3.buoi6;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public void setChieuDai(double chieuDai){
        this.chieuDai = chieuDai;
    }
    public double getChieuDai(){
        return this.chieuDai;
    }
    public void setChieuRong(double chieuRong){
        this.chieuRong = chieuRong;
    }
    public double getChieuRong(){
        return this.chieuRong;
    }
    public double tinhDienTich(){
        return this.chieuDai*this.chieuRong;
    }
    public double tinhChuvi(){
        return (this.chieuDai+this.chieuRong)*2;
    }
    public String toString(){
        String str = "- Chieu dai: "+this.chieuDai+" - Chieu rong: "+this.chieuRong+" - Dien tich: "+this.tinhDienTich()+" - Chu vi: "+this.tinhChuvi();
        return str;
    }
}
