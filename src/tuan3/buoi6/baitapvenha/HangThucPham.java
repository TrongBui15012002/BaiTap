package tuan3.buoi6.baitapvenha;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HangThucPham {
    private int maHang;
    private String tenHang;
    private double donGia;
    private Date nsx;
    private Date hsd;
    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

    public HangThucPham(int maHang, String tenHang, double donGia, String sx, String sd) throws ParseException{
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        nsx = date.parse(sx);
        hsd = date.parse(sd);
    }
    public HangThucPham(int maHang){
        this.maHang = maHang;
    }
    public HangThucPham(){

    }
    public int getMaHang() {
        return maHang;
    }
    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }
    public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    public Double getDonGia() {
        return donGia;
    }
    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }
    public Date getNsx() {
        return nsx;
    }
    public void setNsx(Date nsx) {
        this.nsx = nsx;
    }
    public Date getHsd() {
        return hsd;
    }
    public void setHsd(Date hsd) {
        this.hsd = hsd;
    }
    public String toString(){
        //tiền tệ vnd
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
        String tt = numberFormat.format(donGia);
        //ngày tháng năm

        String sxDate = date.format(nsx);
        String sdDate = date.format(hsd);
        String str = "Thông tin về thực phẩm: \n"+"Mã hàng : " + maHang +"\nTên hàng : " + tenHang +"\nĐơn giá : " + tt +"\nNgày sản xuất : " + sxDate +"\nHạn sử dụng : " + sdDate;
        System.out.println("_____________________________________");
        System.out.println(str);
        return str;
    }   
    public void kiemTraHSD() {
        Date today = new Date();
        today.getTime();
        if (this.getHsd().compareTo(today) < 0) {
            System.out.println("- Thực phẩm hết hạn.");
        } else {
            System.out.println("- Thực phẩm còn hạn.");
        }
    }
}
