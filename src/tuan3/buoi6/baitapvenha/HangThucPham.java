package tuan3.buoi6.baitapvenha;

import java.io.Serializable;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HangThucPham implements Serializable{
    private String maHang;
    private String tenHang;
    private double donGia;
    private Date nsx;
    private Date hsd;
    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

    public HangThucPham(String maHang, String tenHang, double donGia, String sx, String sd) throws ParseException{
        this.setMaHang(maHang);
        this.setTenHang(tenHang);
        this.setDonGia(donGia);
        nsx = date.parse(sx);
        hsd = date.parse(sd);
        this.setHsd(hsd);
        this.setNsx(nsx);
    }
    public HangThucPham(String maHang){
        setMaHang(maHang);
    }
    public HangThucPham(){

    }
    public String getMaHang() {
        return maHang;
    }
    private void setMaHang(String maHang) {
        if(maHang != null){
            this.maHang = maHang;
        }else{
            System.out.println("- Mã hàng không được rỗng");
        }
    }
    public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        if(tenHang != null){
            this.tenHang = tenHang;
        }else{
            System.out.println("- Tên hàng không được để rỗng.");
        }

    }
    public Double getDonGia() {
        return donGia;
    }
    public void setDonGia(Double donGia) {
        if(donGia > 0){
            this.donGia = donGia;
        }else{
            System.out.println("- Đơn giá không được để rỗng(đơn giá phải lớn hơn 0)!");
        }
    }
    public Date getNsx() {
        return nsx;
    }
    public void setNsx(Date nsx) {
        if(nsx != null){
            this.nsx = nsx;
        }else{
            System.out.println("- Ngày sản xuất không đƯợc để rỗng!");
        }
    }
    public Date getHsd() {
        return hsd;
    }
    public void setHsd(Date hsd) {
        if(hsd != null){
            this.hsd = hsd;
        }else{
            System.out.println("- Hạn sử dụng không được để rỗng!");
        }
        if(hsd.after(nsx)){
            this.hsd = hsd;
        }else{
            System.out.println("- Ngày hết hạn phải sau ngày sản xuất.");
        }
    }
    public String toString(){
        //tiền tệ vnd
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
        String tt = numberFormat.format(donGia);
        //ngày tháng năm

         String str = "Thông tin về thực phẩm: \n"+"Mã hàng : " + maHang +"\nTên hàng : " + tenHang +"\nĐơn giá : " + tt +"\nNgày sản xuất : " + date.format(nsx) +"\nHạn sử dụng : " + date.format(hsd);
        // System.out.println("_____________________________________");
        // System.out.println(str);
         return str;
    }   
    public boolean kiemTraHSD() {
        boolean isHetHan = false;//con han
        Date today = new Date();
        if(this.hsd.before(today)){
            isHetHan = true;
        }
        return isHetHan;
    }
}
